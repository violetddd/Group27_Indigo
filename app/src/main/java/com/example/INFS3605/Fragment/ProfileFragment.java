package com.example.INFS3605.Fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.INFS3605.Adapter.MyPhotoAdapter;
import com.example.INFS3605.EditProfileActivity;
import com.example.INFS3605.FollowerActivity;
import com.example.INFS3605.Model.Post;
import com.example.INFS3605.Model.User;
import com.example.INFS3605.OptionsActivity;
import com.example.INFS3605.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProfileFragment extends Fragment {

    ImageView profile_image, options;
    TextView posts, followers, following, fullname, bio, username;
    Button edit;

    private List<String>mySaves;
    RecyclerView recyclerView_saves;
    MyPhotoAdapter myPhotoAdapter_saves;
    List<Post> postList_saves;


    RecyclerView recyclerView;
    MyPhotoAdapter myPhotoAdapter;
    List<Post> postList;

    FirebaseUser firebaseUser;
    String profileid;

    ImageButton my_photos, saved_photos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        SharedPreferences prefs = getContext().getSharedPreferences("PREFS", Context.MODE_PRIVATE);
        profileid = prefs.getString("profileid", "none");

        profile_image = view.findViewById(R.id.image_profile);
        options = view.findViewById(R.id.options);
        posts = view.findViewById(R.id.posts);
        followers = view.findViewById(R.id.followers);
        following = view.findViewById(R.id.following);
        fullname = view.findViewById(R.id.fullname);
        bio = view.findViewById(R.id.bio);
        username = view.findViewById(R.id.username);
        edit = view.findViewById(R.id.edit_profile);
        my_photos = view.findViewById(R.id.my_fotos);
        saved_photos = view.findViewById(R.id.saved_fotos);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        postList= new ArrayList<>();
        myPhotoAdapter = new MyPhotoAdapter(getContext(),postList);
        recyclerView.setAdapter(myPhotoAdapter);



        recyclerView_saves = view.findViewById(R.id.recycler_view_save);
        recyclerView_saves.setHasFixedSize(true);

        StaggeredGridLayoutManager layoutManager_saves = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView_saves.setLayoutManager(layoutManager_saves);
        postList_saves= new ArrayList<>();
        myPhotoAdapter_saves = new MyPhotoAdapter(getContext(),postList_saves);
        recyclerView_saves.setAdapter(myPhotoAdapter_saves);

        recyclerView.setVisibility(View.VISIBLE);
        recyclerView_saves.setVisibility(View.GONE);




        userInfo();
        getFollowers();
        getNrPosts();
        myphotos();
        mysaves();

        if(profileid.equals(firebaseUser.getUid())){
            edit.setText("Edit Profile");
        } else{
            checkFollow();
            saved_photos.setVisibility(View.GONE);
        }

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String button = edit.getText().toString();

                if (button.equals("Edit Profile")) {

                    startActivity(new Intent(getContext(), EditProfileActivity.class));

                } else if (button.equals("follow")) {
                    FirebaseDatabase.getInstance().getReference().child("Follow").child(firebaseUser.getUid()).child("following").child(profileid).setValue(true);
                    FirebaseDatabase.getInstance().getReference().child("Follow").child(profileid).child("followers").child(firebaseUser.getUid()).setValue(true);
                } else if (button.equals("following")) {

                    FirebaseDatabase.getInstance().getReference().child("Follow").child(firebaseUser.getUid()).child("following").child(profileid).removeValue();
                    FirebaseDatabase.getInstance().getReference().child("Follow").child(profileid).child("followers").child(firebaseUser.getUid()).removeValue();
                }
            }
        });

        options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), OptionsActivity.class);
                startActivity(intent);
            }
        });



        my_photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerView.setVisibility(View.VISIBLE);
                recyclerView_saves.setVisibility(View.GONE);
            }
        });

        saved_photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerView.setVisibility(View.GONE);
                recyclerView_saves.setVisibility(View.VISIBLE);
            }
        });

        followers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), FollowerActivity.class);
                intent.putExtra("id",profileid);
                intent.putExtra("title","followers");
                startActivity(intent);
            }
        });

        following.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), FollowerActivity.class);
                intent.putExtra("id",profileid);
                intent.putExtra("title","following");
                startActivity(intent);
            }
        });





        return view;
    }

    private void userInfo(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users").child(profileid);
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                if (getContext() == null) {
                    return;
                }

                User user = snapshot.getValue(User.class);
                Glide.with(getContext()).load(user.getImageurl()).into(profile_image);
                username.setText("Kaya, "+user.getUsername()+"! ");
                fullname.setText(user.getFullname());
                bio.setText(user.getBio());
            }




            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
    }

    private void checkFollow(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Follow").child(firebaseUser.getUid()).child("following");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                if(snapshot.child(profileid).exists()){
                    edit.setText("following");
                } else {
                    edit.setText("follow");
                }
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
    }

    private void getFollowers(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Follow").child(profileid).child("followers");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                followers.setText(""+snapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });

        DatabaseReference reference1 = FirebaseDatabase.getInstance().getReference().child("Follow").child(profileid).child("following");

        reference1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                following.setText(""+snapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
    }

    private void getNrPosts(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Posts");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot dataSnapshot) {
                int i = 0;
                for(DataSnapshot snapshot : dataSnapshot.getChildren()){
                    Post post = snapshot.getValue(Post.class);
                    if(post.getPublisher().equals(profileid)){
                        i++;
                    }
                }
                posts.setText(""+i);
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });

    }

    private void myphotos(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Posts");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                postList.clear();
                for(DataSnapshot snapshot1 : snapshot.getChildren()){
                    Post post = snapshot1.getValue(Post.class);
                    if(post.getPublisher().equals(profileid)){
                        postList.add(post);
                    }
                }
                Collections.reverse(postList);
                myPhotoAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
    }

    private void mysaves(){
        mySaves = new ArrayList<>();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Saves").child(firebaseUser.getUid());
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                for(DataSnapshot  snapshot1 : snapshot.getChildren()){
                    mySaves.add(snapshot1.getKey());
                }

                readSaves();
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
    }

    private void readSaves(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Posts");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                postList_saves.clear();
                for(DataSnapshot snapshot1 : snapshot.getChildren()){
                    Post post = snapshot1.getValue(Post.class);

                    for(String id: mySaves){
                        if(post.getPostid().equals(id)){
                            postList_saves.add(post);
                        }
                    }
                }
                myPhotoAdapter_saves.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
    }


}



