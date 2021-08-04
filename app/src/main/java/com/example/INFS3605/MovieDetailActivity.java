package com.example.INFS3605;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MovieDetailActivity extends AppCompatActivity {
    public static final String INTENT_MESSAGE = "com.example.cultures.intent_message";
    private TextView Movie;
    private TextView Release;
    private TextView Genre;
    private RatingBar myRating;
    private TextView Description;
    private Button Search;
    private String MovieLink;
    private TextView Rating;
    private ImageView MoviePicture;
    //ImageView btn_movie_d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Movie Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        /*btn_movie_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailmovie = new Intent(MovieDetailActivity.this,MovieActivity.class);
                startActivity(detailmovie);
            }
        });*/

        Movie = findViewById(R.id.tvMovie);
        Release = findViewById(R.id.tvRelease);
        Genre = findViewById(R.id.tvGenre);
        myRating = findViewById(R.id.tvRating);
        Description = findViewById(R.id.tvDescription);
        Search = findViewById(R.id.btnSearch);
        MoviePicture = (ImageView) findViewById(R.id.ivMoviePicture);
        Rating=  findViewById(R.id.Rating);

        Intent intent = getIntent();
        String id = intent.getStringExtra(INTENT_MESSAGE);

        Movies movie = Movies.getMovie(id);
        if (movie != null) {
            setTitle(movie.getMovie());

            Movie.setText(movie.getMovie());
            Release.setText("Date: "+movie.getRelease());
            Genre.setText("Genre: "+movie.getGenre());
            Rating.setText("Rating: "+movie.getRating()+"/10");
            myRating.setEnabled(false);
            myRating.setMax(5);
            myRating.setStepSize(0.01f);
            myRating.setRating(Float.parseFloat(String.valueOf(movie.getRating()/2)));
            myRating.invalidate();
            Description.setText(String.valueOf(movie.getDescription()));
            MoviePicture.setImageResource(movie.getMoviePicture());
            Search.setOnClickListener(new View.OnClickListener() { //button to redirect to IMDB site
                @Override
                public void onClick(View v) {
                    watchMovies(movie.getMovieLink());
                }
            });
        }
    }
    private void watchMovies(String movieLink) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/" + movieLink));
        startActivity(intent);
    }
}

