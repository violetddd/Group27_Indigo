package com.example.INFS3605.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.INFS3605.Gallery;
import com.example.INFS3605.R;
import com.example.INFS3605.RecyclerviewAdapter;

import java.util.ArrayList;
import java.util.List;


public class GalleryFragment extends Fragment {

    List<Gallery> lstGallery;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);


        lstGallery = new ArrayList<>();
        lstGallery.add(new Gallery("Australian Museum-Unsettled(Exhibition)","1 William Street, Sydney NSW 2010, Australia","This land was not peacefully settled - Unsettled uncovers the untold histories behind this nation’s foundation story. In this powerful exhibition, First Nations voices reveal the hidden stories of devastation, survival and the fight for recognition. These first-hand accounts are presented through long hidden historical documents, large-scale artworks, immersive experiences and never-before-seen objects from the Australian Museum collections and beyond.heir lived experiences.", R.drawable.am1, "https://australian.museum/exhibition/unsettled/"));
        lstGallery.add (new Gallery("Kate Owen Gallery(Gallery)","680 Darling St. Rozelle NSW 2039 Australia", "We are a multiple award winning gallery in Sydney’s Inner West, specialising in contemporary Aboriginal art for modern interiors. Our Sydney Aboriginal art gallery showcases a large number and a diverse range of styles from Indigenous Australian artists located across the country. Stretching over 600 square metres on three floors, the gallery showcases major exhibitions of established Indigenous masters and exciting new talent. Artworks range from small, affordable paintings to large, investment pieces. Our wide and wonderful collection of Indigenous Australian art is available to view and secure on our user-friendly website. Or you can delve into our articles about Aboriginal art and culture.",R.drawable.b1, "https://www.kateowengallery.com/"));
        lstGallery.add(new Gallery("Cooee Art Gallery(Gallery)","17 Thurlow St, Redfern NSW 2016","Cooee Art was originally established in 1981 and runs a hybrid art model to represent and support artists in an ethical and sustainable way. We have two galleries, our flagship gallery in the heart of Aboriginal Sydney in Redfern and a boutique showroom gallery in Australia’s iconic Bondi Beach along with a seperate fine art auction wing, Cooee Art Auctions established in 2017. Cooee is now Australia’s oldest exhibiting Indigenous art gallery.", R.drawable.c1, "https://www.cooeeart.com.au/"));
        lstGallery.add (new Gallery("Art Gallery of NSW-Aboriginal and Torres Strait Islander art(Exhibition)","Art Gallery Road, The Domain Sydney NSW 2000, Australia","Representing artists from communities across Australia, the Art Gallery of NSW’s collection of Aboriginal and Torres Strait Islander art celebrates Indigenous Australia’s enduring cultural heritage and its myriad contemporary expressions.",R.drawable.d1, "https://www.artgallery.nsw.gov.au/collection/aboriginal-and-torres-strait-islander-art/"));
        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.g_recyclerview_id);

        RecyclerviewAdapter myAdapter = new RecyclerviewAdapter(this.getContext(),lstGallery);
        myrv.setLayoutManager(new GridLayoutManager(this.getContext(),2));
        myrv.setAdapter(myAdapter);
        return view;
    }
}