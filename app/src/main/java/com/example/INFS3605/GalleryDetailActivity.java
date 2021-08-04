package com.example.INFS3605;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class GalleryDetailActivity extends AppCompatActivity {
    private TextView tvtitle, tvlocation, tvdescription;
    private ImageView img;
    ViewFlipper mSlideshow;
    CardView cardOne, cardTwo;
    private Button mSearch;
    ImageView btn_gallerydetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Gallery Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



        tvtitle = (TextView) findViewById(R.id.detail_title_tv);
        tvlocation = (TextView) findViewById(R.id.detail_location_tv);
        tvdescription = (TextView) findViewById(R.id.detail_description_tv);
        img = (ImageView) findViewById(R.id.gallerythumbnail);
        mSearch = findViewById(R.id.Search);


        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Location = intent.getExtras().getString("Location");
        String Description = intent.getExtras().getString("Description");
        String Link = intent.getExtras().getString("Link");
        int image = intent.getExtras().getInt("Thumbnail");


        tvtitle.setText(Title);
        tvlocation.setText(Location);
        tvdescription.setText(Description);
        img.setImageResource(image);


        mSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(Link));
                startActivity(intent);
            }
        });


    }


}
