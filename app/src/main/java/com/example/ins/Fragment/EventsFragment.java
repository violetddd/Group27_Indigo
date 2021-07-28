package com.example.ins.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ins.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EventsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EventsFragment extends Fragment {
    public List<EventResponse> events;
    public List<EventDetailResponse> eventDetailResponses;
    private RecyclerView mRecyclerView;
    private EventsAdapter mAdapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EventsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EventsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EventsFragment newInstance(String param1, String param2) {
        EventsFragment fragment = new EventsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_events,container,false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rvEvent);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //team name API, same API provider of player  that's why they can match easily
        Gson gson = new Gson();
        Type type = new TypeToken<List<EventDetailResponse>>(){}.getType();
        eventDetailResponses = gson.fromJson(EventDetailResponse.json1,type);
        Type type1 = new TypeToken<List<EventResponse>>(){}.getType();
        events = gson.fromJson(EventResponse.json,type1);



        //mAdapter = new EventsAdapter(events,getActivity());
        mAdapter = new EventsAdapter(events,eventDetailResponses,this.getActivity());
        //mAdapter = new EventsAdapter(eventDetailResponses,getActivity());
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