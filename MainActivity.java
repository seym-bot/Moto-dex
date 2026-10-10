package com.motodex.desktop;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.WindowManager;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);
        WebView view = new WebView(this);
        view.setBackgroundColor(0xFF071326);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setDomStorageEnabled(true);
        view.setWebViewClient(new WebViewClient());
        view.setWebChromeClient(new WebChromeClient());
        setContentView(view);
        view.loadUrl("file:///android_asset/index.html");
    }

    @Override public void onBackPressed() {
        // Keep Back from unexpectedly closing the desktop; tap the power icon to exit.
        super.onBackPressed();
    }
}
