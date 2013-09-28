package com.schematical.djax;

import android.content.Context;
import android.webkit.JavascriptInterface;

/**
 * Created by user1a on 9/28/13.
 */
public class DJaxJSInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    DJaxJSInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast) {

    }
}