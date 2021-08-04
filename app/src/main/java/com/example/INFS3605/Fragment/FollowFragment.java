package com.example.INFS3605.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.INFS3605.Adapter.UserAdapter;
import com.example.INFS3605.Model.User;
import com.example.INFS3605.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FollowFragment extends Fragment {

    private RecyclerView recyclerView;
    private UserAdapter myuserAdapter;
    private List<User> myUsers;

    EditText search_bar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        search_bar = view.findViewById(R.id.search_bar);

        myUsers = new ArrayList<>();
        myuserAdapter = new UserAdapter(getContext(), myUsers,true);
        recyclerView.setAdapter(myuserAdapter);

        readUsers();
        search_bar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                searchUsers(charSequence.toString().toLowerCase());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }


        });
        return view;
    }

    private void searchUsers(String s) {
        Query query = FirebaseDatabase.getInstance().getReference("Users").orderByChild("username")
                .startAt(s)
                .endAt(s + "\uf8ff");

        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                myUsers.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    User user = snapshot.getValue(User.class);
                    myUsers.add(user);
                }

                myuserAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void readUsers() {

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (search_bar.getText().toString().equals("")) {
                    myUsers.clear();
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        User user = snapshot.getValue(User.class);
                        myUsers.add(user);
                    }

                    myuserAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }


        });


    }
}
