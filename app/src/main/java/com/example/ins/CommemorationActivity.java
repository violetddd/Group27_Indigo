package com.example.ins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CommemorationActivity extends AppCompatActivity {
    ImageView btn_comm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commemoration);

        btn_comm = (ImageView) findViewById(R.id.btn_comm);
        btn_comm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent faqPage = new Intent(CommemorationActivity.this, FAQActivity.class);
                startActivity(faqPage);
            }
        });
    }
}