package tech.classicaxle.malawicovid_19tracker;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Legal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal);

        String source = getIntent().getStringExtra( "Source");

        WebView  webView =  findViewById(R.id.legalWebView);
        webView.getSettings().setJavaScriptEnabled(true);

        if(source.matches("Privacy")){

            setTitle("Privacy Policy");
            webView.loadUrl("https://sites.google.com/view/malawi-covid-19-tracker/privacy-policy");
        }else{
            setTitle("Term and Conditions");
            webView.loadUrl("https://sites.google.com/view/malawi-covid-19-tracker/terms-and-conditions");

        }
    }
}
