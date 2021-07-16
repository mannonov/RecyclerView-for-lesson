package com.jaxadev.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SecondActivity extends AppCompatActivity {

    WebView webView;

    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        webView = findViewById(R.id.wev_view);

        bundle = getIntent().getExtras();

        webView.loadUrl(bundle.getString(getString(R.string.key)));

        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);

    }
}