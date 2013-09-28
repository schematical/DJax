package com.schematical.djax;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by user1a on 9/28/13.
 */
public class DJaxWebviewClient extends WebViewClient {
    Activity objActivity = null;
    DJaxWebviewClient(Activity objActivity){
        this.objActivity = objActivity;
    }
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (Uri.parse(url).getHost().equals("www.example.com")) {
            // This is my web site, so do not override; let my WebView load the page
            return false;
        }
        // Otherwise, the link is not for a page on my site, so launch another Activity that handles URLs
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        this.objActivity.startActivity(intent);
        return true;
    }

}
