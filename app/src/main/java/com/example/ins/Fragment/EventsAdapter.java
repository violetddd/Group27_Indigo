package com.example.ins.Fragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ins.R;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<com.example.ins.Fragment.EventsAdapter.EventsViewHolder> {
    private List<EventResponse> mEvents;
    public List<EventDetailResponse> mEventDetailResponses;
    private View v;
    Context context;

    //Takes in Array of Team (Details) and Listener and sets them as mVideo's array list above
    //public EventsAdapter(List<EventResponse> events,List<EventDetailResponse> eventDetailResponse, Context context) {
    public EventsAdapter(List<EventResponse> events, List<EventDetailResponse> eventDetailResponse, Context context) {
        this.context =  context;
        this.mEventDetailResponses=eventDetailResponse;
        mEvents = events;
    }

    @NonNull
    @Override
    public com.example.ins.Fragment.EventsAdapter.EventsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list_row, parent, false);
        return new EventsViewHolder(v, context);
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.ins.Fragment.EventsAdapter.EventsViewHolder holder, int position) {
        EventResponse events = mEvents.get(position);
        EventDetailResponse eventDetailResponse = mEventDetailResponses.get(position);
        holder.eventName.setText(eventDetailResponse.getEventName());
        holder.eventDate.setText(eventDetailResponse.getDate());
        holder.eventLocation.setText(eventDetailResponse.getLocation());
        holder.eventCost.setText(eventDetailResponse.getCostOfEntry());
        Glide.with(v).load(eventDetailResponse.getEventImg()).into(holder.image);
        holder.map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.ins.Fragment.EventsAdapter.this.context, com.example.ins.Fragment.EventDetail.class);
                //intent.putExtra("ID",events.getId());
                intent.putExtra("Event Website",eventDetailResponse.getEventWebsite());
                intent.putExtra("ID",events.getId());
//                    intent.putExtra("TeamName",team.getTeamName());
                com.example.ins.Fragment.EventsAdapter.this.context.startActivity(intent);
            }
        });
        /// holder.image.setImageResource(events.getEventImg());
       // holder.image.setImageResource(Integer.parseInt(events.getEventImg()));

    }

    @Override
    public int getItemCount() {
        return mEventDetailResponses.size();
    }

    public class EventsViewHolder extends RecyclerView.ViewHolder{
        public ImageView image;//Change to VideoView if using video for basketball
        public TextView eventName,eventDate,eventLocation,eventCost;
        public ImageView map;
        //TeamViewHolder is a Constructor which IDs the values for the view holders row on the list
        public EventsViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            eventName= itemView.findViewById(R.id.event_name);
            eventDate= itemView.findViewById(R.id.event_date);
            eventLocation= itemView.findViewById(R.id.event_location);
            image= itemView.findViewById(R.id.event_img);
            eventCost= itemView.findViewById(R.id.event_cost);
            map = itemView.findViewById(R.id.map);



        }

    }


    public void sortbydate() {
        if (mEventDetailResponses.size() > 0) {
            Collections.sort(mEventDetailResponses, new Comparator<EventDetailResponse>() {
                @Override
                public int compare(EventDetailResponse c1, EventDetailResponse c2) {
                    return c1.getDateForSort().compareTo(c2.getDateForSort());
                }
            });
        }
        notifyDataSetChanged();
    }

    public void sortbycost() {
        if (mEventDetailResponses.size() > 0) {
            Collections.sort(mEventDetailResponses, new Comparator<EventDetailResponse>() {
                @Override
                public int compare(EventDetailResponse c1, EventDetailResponse c2) {
                    return c2.getFee().compareTo(c1.getFee());
                }
            });
        }
        notifyDataSetChanged();
    }
    public void sortbystate() {
        if (mEventDetailResponses.size() > 0) {
            Collections.sort(mEventDetailResponses, new Comparator<EventDetailResponse>() {
                @Override
                public int compare(EventDetailResponse c1, EventDetailResponse c2) {
                    return c2.getState().compareTo(c1.getState());
                }
            });
        }
        notifyDataSetChanged();
    }
}
