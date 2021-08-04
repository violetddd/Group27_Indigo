package com.example.INFS3605.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.INFS3605.MovieAdapter;
import com.example.INFS3605.MovieDetailActivity;
import com.example.INFS3605.Movies;
import com.example.INFS3605.R;

public class MovieFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private MovieAdapter mAdapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie, container, false);
        setHasOptionsMenu(true);

        mRecyclerView = view. findViewById(R.id.rvList_movie);
        mRecyclerView.setHasFixedSize(true);

        MovieAdapter.RecyclerViewClickListener listener = new MovieAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, String id) {
                launchDetailActivity(id);
            }
        };
        mAdapter = new MovieAdapter(Movies.getMovies(), listener);
        mRecyclerView.setAdapter(mAdapter);
        return view;

    }

    private void launchDetailActivity(String message){ //launch detail activity
        Intent intent = new Intent(getActivity(), MovieDetailActivity.class);
        intent.putExtra(MovieDetailActivity.INTENT_MESSAGE, message);
        startActivity(intent);
    }

}