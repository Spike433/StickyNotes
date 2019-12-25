package com.example.stickynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onenote.com/stickynotes"));
        startActivity(browserIntent);
        finish();
        System.exit(0);

    }





}
