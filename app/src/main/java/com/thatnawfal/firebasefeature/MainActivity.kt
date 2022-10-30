package com.thatnawfal.firebasefeature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.google.firebase.analytics.FirebaseAnalytics


class MainActivity : AppCompatActivity() {

    private lateinit var mFirebaseAnalytics: FirebaseAnalytics
//    private lateinit var mAdView: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

//        initAdsBanner()
//        mAdView = findViewById(R.id.adView);



    }

//    private fun initAdsBanner() {
//        val adRequest: AdRequest = AdRequest.Builder().build()
//        mAdView.loadAd(adRequest)
//    }
}