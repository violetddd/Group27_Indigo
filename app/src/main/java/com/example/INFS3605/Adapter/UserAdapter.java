package com.example.INFS3605.Adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.INFS3605.Fragment.ProfileFragment;
import com.example.INFS3605.MainActivity;
import com.example.INFS3605.Model.User;
import com.example.INFS3605.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>{

    private Context myContext;
    private List<User> mUsers;
    private boolean isfragment;

    private FirebaseUser firebaseUser;

    public UserAdapter(Context MYContext, List<User> mUsers, boolean isfragment) {
        this.myContext = MYContext;
        this.mUsers = mUsers;
        this.isfragment=isfragment;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(myContext).inflate(R.layout.user_item, viewGroup, false);
        return new UserAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        final User user = mUsers.get(i);
        viewHolder.btn_follow.setVisibility(View.VISIBLE);

        viewHolder.username.setText(user.getUsername());
        viewHolder.fullname.setText(user.getFullname());

        Glide.with(myContext).load(user.getImageurl()).into(viewHolder.image_profile);
        isFollowing(user.getId(), viewHolder.btn_follow);

        if(user.getId().equals(firebaseUser.getUid())){
            viewHolder.btn_follow.setVisibility(View.GONE);
        }

        viewHolder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (isfragment) {
                    SharedPreferences.Editor editor = myContext.getSharedPreferences("PREFS", Context.MODE_PRIVATE).edit();
                    editor.putString("profileid", user.getId());
                    editor.apply();

                    ((FragmentActivity) myContext).getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            new ProfileFragment()).commit();

                } else{
                    Intent intent = new Intent(myContext, MainActivity.class);
                    intent.putExtra("publisherid",user.getId());
                    myContext.startActivity(intent);
                }
            }
        });

        viewHolder.btn_follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (viewHolder.btn_follow.getText().toString().equals("follow")){
                    FirebaseDatabase.getInstance().getReference().child("Follow").child(firebaseUser.getUid())
                            .child("following").child(user.getId()).setValue(true);
                    FirebaseDatabase.getInstance().getReference().child("Follow").child(user.getId())
                            .child("followers").child(firebaseUser.getUid()).setValue(true);
                } else{
                    FirebaseDatabase.getInstance().getReference().child("Follow").child(firebaseUser.getUid())
                            .child("following").child(user.getId()).removeValue();
                    FirebaseDatabase.getInstance().getReference().child("Follow").child(user.getId())
                            .child("followers").child(firebaseUser.getUid()).removeValue();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView username;
        public TextView fullname;
        public CircleImageView image_profile;
        public Button btn_follow;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            username = itemView.findViewById(R.id.username);
            fullname = itemView.findViewById(R.id.fullname);
            image_profile = itemView.findViewById(R.id.image_profile);
            btn_follow = itemView.findViewById(R.id.btn_follow);
        }
    }

    private void isFollowing(final String userid, final Button button) {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference()
                .child("Follow").child(firebaseUser.getUid()).child("following");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange (DataSnapshot dataSnapshot) {
                if (dataSnapshot.child(userid).exists()){
                    button.setText("following");
                } else {
                    button.setText("follow");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError){

            }



        });


    }



}


