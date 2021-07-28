package com.example.ins.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ins.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class EventDetail extends Activity {
    public List<EventDetailResponse> eventDetailResponses;
    TextView EventName,EventDate,EventLocation,EventCost,EventWeb;
    ImageView eventOnline;
    Button bt_web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_detail_page);
        Intent intent = getIntent();
        int ID = intent.getIntExtra("ID",0);
        WebView webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);

        EventName = findViewById(R.id.EventName);
        EventDate = findViewById(R.id.EventDate);
        EventLocation = findViewById(R.id.EventLocation);
        EventCost = findViewById(R.id.EventCost);
       // EventWeb = findViewById(R.id.EventWeb);
        eventOnline = findViewById(R.id.eventOnline);
        bt_web=findViewById(R.id.bt_web);

        Gson gson = new Gson();
        Type type = new TypeToken<List<EventDetailResponse>>(){}.getType();
        eventDetailResponses = gson.fromJson(EventDetailResponse.json1,type);
        for(EventDetailResponse eventDetailResponse: eventDetailResponses){
            if (eventDetailResponse.getEventID() ==ID){
                EventName.setText(eventDetailResponse.getEventName());
                EventDate.setText(eventDetailResponse.getDate());
                EventCost.setText(eventDetailResponse.getCostOfEntry());
               // EventWeb.setText(eventDetailResponse.getEventWebsite());

                if(eventDetailResponse.getLongitude()==0){
                   webview.setVisibility(View.GONE);
                    eventOnline.setVisibility(View.VISIBLE);
            }else{
                    EventLocation.setText(eventDetailResponse.getLocation());
                    //        webview.loadUrl("https://www.google.com/maps/@-33.9231399,151.2219017,15z");
                    webview.loadUrl("https://www.google.com/maps/@"+eventDetailResponse.getLatitude()+","+eventDetailResponse.getLongitude()+",18z");
                }
            }
        }


        bt_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(intent.getStringExtra("Event Website").equals("N/A")){
                    Toast toast = Toast.makeText(com.example.ins.Fragment.EventDetail.this, "Sorry, no more information provided", Toast.LENGTH_SHORT);
                    toast.show();
               }else{
                    Uri uri = Uri.parse(intent.getStringExtra("Event Website"));
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            }
        });
        

}}
