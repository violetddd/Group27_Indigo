package com.example.ins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HistoryActivity extends AppCompatActivity {
    ImageView btn_histories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        btn_histories = (ImageView) findViewById(R.id.btn_histories);
        btn_histories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent faqPage = new Intent(HistoryActivity.this, FAQActivity.class);
                startActivity(faqPage);
            }
        });
    }
}