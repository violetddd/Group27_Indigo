package com.example.ins.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
//import com.example.ins.GlideApp;
import com.bumptech.glide.request.target.Target;
import com.example.ins.CommentsActivity;
import com.example.ins.GlideApp;
import com.example.ins.Model.Post;
import com.example.ins.Model.User;
import com.example.ins.PostActivity;
import com.example.ins.R;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
//import com.google.firebase.database.core.Context;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder>{

        public Context mContext;
        //public Context mContext;
        public List<Post> mPost;

        private FirebaseUser firebaseUser;
        private StorageReference ref;

        public PostAdapter(Context mContext, List<Post> mPost){
            this.mContext = mContext;
            this.mPost = mPost;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
            View view = LayoutInflater.from(mContext).inflate(R.layout.post_item, viewGroup,false);
            return new PostAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i){

            firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
            Post post = mPost.get(i);
            String url = post.getPostimage();


            FirebaseStorage storage = FirebaseStorage.getInstance();
            StorageReference storageReference = storage.getReferenceFromUrl(url);
            //StorageReference ref= FirebaseStorage.getInstance().getReference();




            GlideApp.with(mContext).load(storageReference).into(viewHolder.post_image);



           if(post.getDescription().equals("")){
                viewHolder.description.setVisibility(View.GONE);
            } else{
                viewHolder.description.setVisibility(View.VISIBLE);
                viewHolder.description.setText(post.getDescription());
            }

            publisherInfo(viewHolder.image_profile, viewHolder.username, viewHolder.publisher,post.getPublisher());
            isLiked(post.getPostid(),viewHolder.like);
            nrLikes(viewHolder.likes, post.getPostid());
            getComments(post.getPostid(), viewHolder.comments);
            isSaved(post.getPostid(), viewHolder.save);

            viewHolder.save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(viewHolder.save.getTag().equals("save")){
                        FirebaseDatabase.getInstance().getReference().child("Saves").child(firebaseUser.getUid()).child(post.getPostid()).setValue(true);
                    } else{
                        FirebaseDatabase.getInstance().getReference().child("Saves").child(firebaseUser.getUid()).child(post.getPostid()).removeValue();
                    }
                }
            });

            viewHolder.like.setOnClickListener(new View.OnClickListener() {

               @Override
               public void onClick(View view) {
                   //System.out.println("hiii");
                   if(viewHolder.like.getTag().equals("like")){
                       FirebaseDatabase.getInstance().getReference().child("likes").child(post.getPostid()).child(post.getPublisher());
                       isLiked(post.getPostid(), viewHolder.like);
                       nrLikes(viewHolder.likes, post.getPostid());

                       viewHolder.like.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                               if(viewHolder.like.getTag().equals("like")){
                                   FirebaseDatabase.getInstance().getReference().child("likes").child(post.getPostid()).child(firebaseUser.getUid()).setValue(true);
                                   //isLiked(post.getPostid(), viewHolder.like);
                                  // nrLikes(viewHolder.likes, post.getPostid());
                               } else {
                                   FirebaseDatabase.getInstance().getReference().child("Likes").child(post.getPostid()).child(firebaseUser.getUid()).removeValue();
                               }
                           }
                       });
                   }
               }
           });

            viewHolder.comment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(mContext, CommentsActivity.class);
                    intent.putExtra("postid",post.getPostid());
                    intent.putExtra("publisherid",post.getPublisher());
                    mContext.startActivity(intent);
                }
            });

            viewHolder.comments.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(mContext, CommentsActivity.class);
                    intent.putExtra("postid",post.getPostid());
                    intent.putExtra("publisherid",post.getPublisher());
                    mContext.startActivity(intent);
                }
            });





        }

        @Override
        public int getItemCount(){
            return mPost.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder{

            public ImageView image_profile, post_image,like, comment,save;
            public TextView username, likes, publisher, description, comments;

            public ViewHolder(@NonNull View itemView){
                super(itemView);

                image_profile = itemView.findViewById(R.id.image_profile);
                post_image = itemView.findViewById(R.id.post_image);
                comments = itemView.findViewById(R.id.comments);
                like = itemView.findViewById(R.id.like);
                comment = itemView.findViewById(R.id.comment);
                save = itemView.findViewById(R.id.save);
                username = itemView.findViewById(R.id.username);
                likes = itemView.findViewById(R.id.likes);
                publisher = itemView.findViewById(R.id.publisher);
                description = itemView.findViewById(R.id.description);




            }

        }

        private void getComments(String postid, final TextView comments){
            DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Comments").child(postid);
            reference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                    comments.setText("View All"+snapshot.getChildrenCount()+" Comments");
                }

                @Override
                public void onCancelled(@NonNull @NotNull DatabaseError error) {

                }
            });
        }


        private void isLiked(String postid, final ImageView imageView){

            final FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

            DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("likes").child(postid);

            reference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    if (dataSnapshot.child(firebaseUser.getUid()).exists()){
                        imageView.setImageResource(R.drawable.ic_liked);
                        imageView.setTag("liked");
                    } else{
                        imageView.setImageResource(R.drawable.ic_like);
                        imageView.setTag("like");
                        System.out.println(firebaseUser.getUid());
                    }
                }

                @Override
                public void onCancelled(@NonNull @NotNull DatabaseError error) {

                }
            });
        }

        private void nrLikes(TextView likes, String postid){
            DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("likes").child(postid);
            System.out.println(postid);
            reference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange( DataSnapshot dataSnapshot) {
                    likes.setText(dataSnapshot.getChildrenCount()+"likes");

                    //likes.setText("11 likes");
                }

                @Override
                public void onCancelled(@NonNull @NotNull DatabaseError error) {

                }
            });
        }






        private void publisherInfo(final ImageView image_profile, final TextView username, final TextView publisher, final String userid){
            DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users").child(userid);

            reference.addValueEventListener(new ValueEventListener(){
                @Override
                public void onDataChange(DataSnapshot dataSnapshot){
                    User user = dataSnapshot.getValue(User.class);
                    Glide.with(mContext).load(user.getImageurl()).into(image_profile);
                    username.setText(user.getUsername());
                    publisher.setText(user.getUsername());

                }

                @Override
                public void onCancelled(DatabaseError databaseError){

                }


            });

        }

        private void isSaved(final String postid, ImageView imageView){
            FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

            DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Saves").child(firebaseUser.getUid());

            reference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                    if (snapshot.child(postid).exists()){
                        imageView.setImageResource(R.drawable.ic_save_black);
                        imageView.setTag("saved");
                    } else{
                        imageView.setImageResource(R.drawable.ic_save);
                        imageView.setTag("save");
                    }
                }

                @Override
                public void onCancelled(@NonNull @NotNull DatabaseError error) {

                }
            });
        }



    }
