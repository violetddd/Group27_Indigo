package com.example.ins;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MoviesViewHolder> implements Filterable {

    private ArrayList<Movies> mMovies, mMoviesFiltered;
    private RecyclerViewClickListener mListener;



    public MovieAdapter(ArrayList<Movies> movies, RecyclerViewClickListener listener){
        mMovies = movies;
        mListener = listener;
        mMoviesFiltered = movies;
    }

    @Override
    public Filter getFilter() { //filters movies based on user keyboard input
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String charString = constraint.toString();
                if(charString.isEmpty()){
                    mMoviesFiltered = mMovies;
                }else {
                    ArrayList<Movies> filteredList = new ArrayList<>();
                    for (Movies movie : mMovies) {
                        if (movie.getMovie().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(movie);
                        }
                    }
                    mMoviesFiltered = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = mMoviesFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                mMoviesFiltered = (ArrayList<Movies>) results.values;
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
        Movies movie = mMoviesFiltered.get(position);
        holder.movie.setText(movie.getMovie());
        holder.rating.setText(movie.getRating());
        holder.release.setText(movie.getRelease());
        holder.genre.setText(movie.getGenre());
        holder.itemView.setTag(movie.getId());
        holder.image.setImageResource(movie.getMoviePicture());

    }

    @Override
    public int getItemCount() { return mMoviesFiltered.size();}


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
    public void sort(final String sortMethod){ //sorting through movies by either rating or release date depending on what the user chooses in descending order

        Collections.sort(mMoviesFiltered, new Comparator<Movies>() {
            @Override
            public int compare(Movies o1, Movies o2) {
                if (sortMethod == "SORT_RATING") { //sort by rating
                    return o2.getRating().compareTo(o1.getRating());
                } else { //sort by release date
                    return o2.getRelease().compareTo(o1.getRelease());
                }
            }
        });
        notifyDataSetChanged(); //notify changes to adapter
    }
}
