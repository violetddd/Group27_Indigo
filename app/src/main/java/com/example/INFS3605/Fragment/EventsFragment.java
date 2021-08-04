package com.example.INFS3605.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.INFS3605.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;


public class EventsFragment extends Fragment {
    public List<EventResponse> events;
    public List<EventDetailResponse> eventDetailResponses;
    private RecyclerView mRecyclerView;
    private EventsAdapter mAdapter;


    public EventsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_events,container,false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rvEvent);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        Gson gson = new Gson();
        Type type = new TypeToken<List<EventDetailResponse>>(){}.getType();
        eventDetailResponses = gson.fromJson(EventDetailResponse.json1,type);
        Type type1 = new TypeToken<List<EventResponse>>(){}.getType();
        events = gson.fromJson(EventResponse.json,type1);


        mAdapter = new EventsAdapter(events,eventDetailResponses,this.getActivity());
        mRecyclerView.setAdapter(mAdapter);

        Button bt_date = view.findViewById(R.id.sort_date);
        bt_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAdapter.sortbydate();
            }
        });

        Button bt_cost = view.findViewById(R.id.sort_cost);
        bt_cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAdapter.sortbycost();
            }
        });
        Button bt_state = view.findViewById(R.id.sort_state);
        bt_state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAdapter.sortbystate();
            }
        });

        return view;

    }
}