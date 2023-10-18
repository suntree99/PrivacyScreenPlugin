/**
 * PrivacyScreenPlugin.java Cordova Plugin Implementation
 * Created by Tommy-Carlos Williams on 18/07/14.
 * Copyright (c) 2014 Tommy-Carlos Williams. All rights reserved.
 * MIT Licensed
 */
package org.devgeeks.privacyscreen;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaActivity;

import android.view.Window;
import android.view.WindowManager;


/**
 * This class sets the FLAG_SECURE flag on the window to make the app
 *  private when shown in the task switcher
 */

public class PrivacyScreenPlugin extends CordovaActivity {

  @Override
   public void onWindowFocusChanged(boolean hasFocus) {
     
    // isWindowFocused = hasFocus;
  
    if(hasFocus) {
          Window window = this.cordova.getActivity().getWindow();
          window.clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
      } else {
          Window window = this.cordova.getActivity().getWindow();
          window.setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
      }
  
    // if (isBackPressed && !hasFocus) {
    //  isBackPressed = false;
    //  isWindowFocused = true;
    // }
  
    super.onWindowFocusChanged(hasFocus);
   }
}
