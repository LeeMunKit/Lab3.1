package my.edu.tarc.lab31;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import java.net.URL;

public class Sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.google.com/");


    }
}
