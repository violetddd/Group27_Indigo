package com.example.ins.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ins.R;


public class NotificationFragment extends Fragment {

    Button faqPage_btn, musicPage_btn, moviePage_btn,galleryPage_btn;

    public NotificationFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       View v = inflater.inflate(R.layout.fragment_notification, container, false);

        musicPage_btn = v.findViewById(R.id.go_to_music);
        musicPage_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getActivity(), MusicActivity.class));
                Fragment fragment = new MusicFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        faqPage_btn = v.findViewById(R.id.go_to_FAQ);
        faqPage_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new FAQFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

       galleryPage_btn = v.findViewById(R.id.go_to_gallery);
       galleryPage_btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //startActivity(new Intent(getActivity(), GalleryActivity.class));
               Fragment fragment = new GalleryFragment();
               FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
               FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
               fragmentTransaction.replace(R.id.fragment_container, fragment);
               fragmentTransaction.addToBackStack(null);
               fragmentTransaction.commit();
           }
       });

       moviePage_btn = v.findViewById(R.id.go_to_movies);
       moviePage_btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //startActivity(new Intent(getActivity(), MovieActivity.class));
               Fragment fragment = new MovieFragment();
               FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
               FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
               fragmentTransaction.replace(R.id.fragment_container, fragment);
               fragmentTransaction.addToBackStack(null);
               fragmentTransaction.commit();
           }
       });

        return v;
    }
}