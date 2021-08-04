package com.example.INFS3605;



import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Gallery> mData;

    public RecyclerviewAdapter(Context mContext, List<Gallery> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_gallery, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerviewAdapter.MyViewHolder holder, int position) {
        holder.tv_gallery_title.setText(mData.get(position).getTitle());
        holder.img_gallery_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, GalleryDetailActivity.class);
                intent.putExtra("Title", mData.get(position).getTitle());
                intent.putExtra("Location", mData.get(position).getLocation());
                intent.putExtra("Description", mData.get(position).getDescription());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());
                intent.putExtra("Link",mData.get(position).getLink());
                mContext.startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_gallery_title;
        ImageView img_gallery_thumbnail;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);

            tv_gallery_title = (TextView) itemView.findViewById(R.id.gallery_title_id);
            img_gallery_thumbnail = (ImageView) itemView.findViewById(R.id.gallery_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);

        }

    }
}
