/**
 * PrivacyScreenPlugin.java Cordova Plugin Implementation
 * Created by Tommy-Carlos Williams on 18/07/14.
 * Copyright (c) 2014 Tommy-Carlos Williams. All rights reserved.
 * MIT Licensed
 */
package org.devgeeks.privacyscreen;

import org.devgeeks.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

import android.view.Window;
import android.view.WindowManager;

/**
 * This class sets the FLAG_SECURE flag on the window to make the app
 *  private when shown in the task switcher
 */
public class PrivacyScreenPlugin extends CordovaPlugin {

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if (hasFocus) {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
        } else {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);
        }
        super.onWindowFocusChanged(hasFocus);
    }
}
