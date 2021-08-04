package com.example.INFS3605;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MoviesViewHolder> implements Filterable {

    private ArrayList<Movies> myMovies, myMoviesFiltered;
    private RecyclerViewClickListener mListener;



    public MovieAdapter(ArrayList<Movies> movies, RecyclerViewClickListener listener){
        myMovies = movies;
        mListener = listener;
        myMoviesFiltered = movies;
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String charString = constraint.toString();
                if(charString.isEmpty()){
                    myMoviesFiltered = myMovies;
                }else {
                    ArrayList<Movies> filteredList = new ArrayList<>();
                    for (Movies movie : myMovies) {
                        if (movie.getMovie().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(movie);
                        }
                    }
                    myMoviesFiltered = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = myMoviesFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                myMoviesFiltered = (ArrayList<Movies>) results.values;
                notifyDataSetChanged();
            }
        };
    }

    public interface RecyclerViewClickListener{
        void onClick(View view, String id);
    }

    @NonNull
    @Override
    public MovieAdapter.MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row, parent, false);
        return new MoviesViewHolder(v, mListener);
    }


    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MoviesViewHolder holder, int position) { //getting the right fields from Movies.java to display on movie_list_row
        Movies movie = myMoviesFiltered.get(position);
        holder.movie.setText(movie.getMovie());
        holder.rating.setText("Rating: "+movie.getRating()+"/10");
        holder.release.setText("Date: "+movie.getRelease());
        holder.genre.setText("Genre: "+movie.getGenre());
        holder.itemView.setTag(movie.getId());
        holder.image.setImageResource(movie.getMoviePicture());

    }

    @Override
    public int getItemCount() { return myMoviesFiltered.size();}


    public class MoviesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView movie;
        public TextView rating;
        public TextView genre;
        public TextView release;
        public ImageView image;
        private RecyclerViewClickListener listener;

        public MoviesViewHolder(@NonNull View itemView, RecyclerViewClickListener listener){
            super(itemView);
            this.listener = listener;
            itemView.setOnClickListener(this);
            movie = itemView.findViewById(R.id.tvMovie);
            rating = itemView.findViewById(R.id.tvRating);
            genre = itemView.findViewById(R.id.tvGenre);
            release = itemView.findViewById(R.id.tvRelease);
            image = (ImageView) itemView.findViewById(R.id.ivMoviePicture);


        }
        @Override
        public void onClick(View v) {
            listener.onClick(v, (String) v.getTag());
        }
    }

}
