package com.example.banneraddimplement2024827;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

public class MainActivity extends AppCompatActivity {

    LinearLayout adContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        adContainerView=findViewById(R.id.adContainerView);


// Create a new ad view.
       AdView adView = new AdView(this);
        adView.setAdUnitId("ca-app-pub-3940256099942544/9214589741");
        adView.setAdSize(AdSize.BANNER);

// Replace ad container with new ad view.
        adContainerView.removeAllViews();
        adContainerView.addView(adView);



        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);



    }

}