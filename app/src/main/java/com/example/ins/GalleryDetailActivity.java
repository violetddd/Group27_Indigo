package com.example.ins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
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

      //  getSupportActionBar().setTitle("Gallery Information");
      //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvtitle = (TextView) findViewById(R.id.detail_title_tv);
        tvlocation = (TextView) findViewById(R.id.detail_location_tv);
        tvdescription = (TextView) findViewById(R.id.detail_description_tv);
        img = (ImageView) findViewById(R.id.gallerythumbnail);
        mSearch = findViewById(R.id.Search);

//        int pictures[] = {R.drawable.am1, R.drawable.am2, R.drawable.am3, R.drawable.b1, R.drawable.b2, R.drawable.bi0lqr, R.drawable.image__1_, R.drawable.bg1};
//
//        mSlideshow = findViewById(R.id.slideshow);


        //Receive data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Location = intent.getExtras().getString("Location");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        //Set values
        tvtitle.setText(Title);
        tvlocation.setText(Location);
        tvdescription.setText(Description);
        img.setImageResource(image);

        btn_gallerydetail = (ImageView) findViewById(R.id.back_btn_g_detail);
        btn_gallerydetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gdetailPage = new Intent (GalleryDetailActivity.this, GalleryActivity .class);
                startActivity(gdetailPage);
            }
        });


//        for (int picture : pictures) {//condition for slideshow
//            slideImages(picture);
//        }
    }

//    private void slideImages(int picture) {
//        ImageView imageView = new ImageView(this);
//        imageView.setBackgroundResource(picture);
//        mSlideshow.addView(imageView);
//        mSlideshow.setFlipInterval(3000);//changes images every 3 seconds
//        mSlideshow.setAutoStart(true);//automatically starts the image change countdown
//        mSlideshow.setInAnimation(this, android.R.anim.slide_in_left);
//        mSlideshow.setOutAnimation(this, android.R.anim.slide_out_right);
//    }
}