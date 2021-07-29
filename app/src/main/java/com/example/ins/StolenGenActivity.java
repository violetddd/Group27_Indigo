package com.example.ins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class StolenGenActivity extends AppCompatActivity {
    ImageView btn_stolengens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stolen_gen);

        btn_stolengens = (ImageView) findViewById(R.id.btn_stolengens_back);
        btn_stolengens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent faqPage = new Intent(StolenGenActivity.this, FAQActivity.class);
                startActivity(faqPage);
            }
        });
    }
}
