/**
 * PrivacyScreenPlugin.java Cordova Plugin Implementation
 * Created by Tommy-Carlos Williams on 18/07/14.
 * Copyright (c) 2014 Tommy-Carlos Williams. All rights reserved.
 * MIT Licensed
 */
package org.devgeeks.privacyscreen;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

import org.apache.cordova.CallbackContext;
import android.app.Activity;

import android.view.Window;
import android.view.WindowManager;

import android.content.Context;
import android.os.Bundle;

/**
 * This class sets the FLAG_SECURE flag on the window to make the app
 *  private when shown in the task switcher
 */

public class PrivacyScreenPlugin extends CordovaActivity {

  @Override
   public void onWindowFocusChanged(boolean hasFocus) {
     
    boolean isWindowFocused = hasFocus;
  
    if(hasFocus) {
          getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
      } else {
          getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
      }
  
    if (isBackPressed && !hasFocus) {
     isBackPressed = false;
     isWindowFocused = true;
    }
  
    super.onWindowFocusChanged(hasFocus);
   }
}
