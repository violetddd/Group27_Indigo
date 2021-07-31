package com.example.ins.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.ins.CommemorationActivity;
import com.example.ins.FAQActivity;
import com.example.ins.HistoryActivity;
import com.example.ins.R;
import com.example.ins.ReconciliationActivity;
import com.example.ins.StolenGenActivity;


public class FAQFragment extends Fragment {

    Button btn_stolen, btn_history, btn_comm, btn_recon;
    ImageView btn_back_faq;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_f_a_q,container, false);

        btn_stolen = view.findViewById(R.id.btn_go_stolen);
        btn_stolen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stolenPage = new Intent(getActivity(), StolenGenActivity.class);
                startActivity(stolenPage);
            }
        });

        btn_history = view.findViewById(R.id.btn_go_histories);
        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historyPage = new Intent(getActivity(), HistoryActivity.class);
                startActivity(historyPage);
            }
        });

        btn_comm = view.findViewById(R.id.btn_go_comm);
        btn_comm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent commPage = new Intent(getActivity(), CommemorationActivity.class);
                startActivity(commPage);
            }
        });

        btn_recon = view.findViewById(R.id.btn_go_recon);
        btn_recon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reconPage = new Intent(getActivity(), ReconciliationActivity.class);
                startActivity(reconPage);
            }
        });

        //  btn_back_faq = (ImageView) findViewById(R.id.back_btn_faq);
        //   btn_back_faq.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //      public void onClick(View v) {
        //          Intent cultureFaq = new Intent(FAQActivity.this, NotificationFragment.class);
        //          startActivity(cultureFaq);
        //     }
        //  });



        return view;
    }
}