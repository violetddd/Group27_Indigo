package com.example.ins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ReconciliationActivity extends AppCompatActivity {
 //   ImageView btn_recons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reconciliation);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Reconciliation");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


   //     btn_recons = (ImageView) findViewById(R.id.btn_recon);
    //    btn_recons.setOnClickListener(new View.OnClickListener() {
     //       @Override
    //        public void onClick(View v) {
   //             Intent faqPage = new Intent(ReconciliationActivity.this, FAQActivity.class);
  //              startActivity(faqPage);
  //          }
  //      });
    }
}