package com.example.ins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.ins.Fragment.NotificationFragment;

public class FAQActivity extends AppCompatActivity {

    Button btn_stolen, btn_history, btn_comm, btn_recon;
    ImageView btn_back_faq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqactivity);

        btn_stolen = findViewById(R.id.btn_go_stolen);
        btn_stolen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stolenPage = new Intent(FAQActivity.this, StolenGenActivity.class);
                startActivity(stolenPage);
            }
        });

        btn_history = findViewById(R.id.btn_go_histories);
        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historyPage = new Intent(FAQActivity.this, HistoryActivity.class);
                startActivity(historyPage);
            }
        });

        btn_comm = findViewById(R.id.btn_go_comm);
        btn_comm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent commPage = new Intent(FAQActivity.this, CommemorationActivity.class);
                startActivity(commPage);
            }
        });

        btn_recon = findViewById(R.id.btn_go_recon);
        btn_recon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reconPage = new Intent(FAQActivity.this, ReconciliationActivity.class);
                startActivity(reconPage);
            }
        });

        btn_back_faq = (ImageView) findViewById(R.id.back_btn_faq);
        btn_back_faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cultureFaq = new Intent(FAQActivity.this, NotificationFragment.class);
                startActivity(cultureFaq);
            }
        });


    }
}
