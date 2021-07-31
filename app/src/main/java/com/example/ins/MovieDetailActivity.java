package com.example.ins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetailActivity extends AppCompatActivity {
    public static final String INTENT_MESSAGE = "com.example.cultures.intent_message";
    private TextView mMovie;
    private TextView mRelease;
    private TextView mGenre;
    private TextView mRating;
    private TextView mDescription;
    private Button mSearch;
    private String mMovieLink;
    private ImageView mMoviePicture;
    ImageView btn_movie_d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        btn_movie_d = (ImageView)findViewById(R.id.back_btn_m_detail);
        /*btn_movie_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailmovie = new Intent(MovieDetailActivity.this,MovieActivity.class);
                startActivity(detailmovie);
            }
        });*/

        mMovie = findViewById(R.id.tvMovie);
        mRelease = findViewById(R.id.tvRelease);
        mGenre = findViewById(R.id.tvGenre);
        mRating = findViewById(R.id.tvRating);
        mDescription = findViewById(R.id.tvDescription);
        mSearch = findViewById(R.id.btnSearch);
        mMoviePicture = (ImageView) findViewById(R.id.ivMoviePicture);

        Intent intent = getIntent();
        String id = intent.getStringExtra(INTENT_MESSAGE); //retrieves the movie that the user clicked on in movie_list_row

        Movies movie = Movies.getMovie(id);
        if (movie != null) { //gets the movie that the user clicks on, doesn't happen unless user clicks.
            setTitle(movie.getMovie());
            mMovie.setText(String.valueOf(movie.getMovie()));
            mRelease.setText(String.valueOf(movie.getRelease()));
            mGenre.setText(String.valueOf(movie.getGenre()));
            mRating.setText(String.valueOf(movie.getRating()));
            mDescription.setText(String.valueOf(movie.getDescription()));
            mMoviePicture.setImageResource(movie.getMoviePicture());
            mSearch.setOnClickListener(new View.OnClickListener() { //button to redirect to IMDB site
                @Override
                public void onClick(View v) {
                    searchMovies(movie.getMovieLink());
                }
            });
        }
    }
    private void searchMovies(String movieLink) { //Specially created another field to incorporate IMDB because the name would not be valid to find the page
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/" + movieLink));
        startActivity(intent); //Upon pressing "More Information" button, searches IMDB with the movieLink to find the right movie info page
    }
}

