package com.example.ins;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;


public class MovieActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MovieAdapter mAdapter;
//    ImageView btn_movies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
       // getSupportActionBar().setTitle("Explore Movies");
      //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //      btn_movies = (ImageView)findViewById(R.id.back_btn_movie) ;
        //        btn_movies.setOnClickListener(new View.OnClickListener() {
        //         @Override
        //          public void onClick(View v) {
        //            Intent moviePage = new Intent(MovieActivity.this,CultureActivity.class);
        //            startActivity(moviePage);
        //          }
        //       });


        mRecyclerView = findViewById(R.id.rvList_movie);
        mRecyclerView.setHasFixedSize(true);

        MovieAdapter.RecyclerViewClickListener listener = new MovieAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, String id) {
                launchDetailActivity(id);
            }
        };
        mAdapter = new MovieAdapter(Movies.getMovies(), listener);
        mRecyclerView.setAdapter(mAdapter);

    }
    private void launchDetailActivity(String message){ //launch detail activity
        Intent intent = new Intent(this, MovieDetailActivity.class);
        intent.putExtra(MovieDetailActivity.INTENT_MESSAGE, message);
        startActivity(intent);
    }

    @Override
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
        return true;
    }
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