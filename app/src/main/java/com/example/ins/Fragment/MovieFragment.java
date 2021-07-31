package com.example.ins.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.example.ins.MovieAdapter;
import com.example.ins.MovieDetailActivity;
import com.example.ins.Movies;
import com.example.ins.R;

public class MovieFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private MovieAdapter mAdapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
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

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu){ //instantiating menu_main
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_movies, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.app_bar_search).getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {//pass search text
                mAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) { //pass the search query
                mAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;*/
    //}
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){ //two cases for whether user chooses to sort by release date or rating
        switch(item.getItemId()){
            case R.id.sortRating:
                mAdapter.sort("SORT_RATING");
                return true;

            case R.id.sortRelease:
                mAdapter.sort("SORT_RELEASE");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }






    }
}