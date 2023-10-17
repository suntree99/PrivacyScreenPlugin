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

// import org.apache.cordova.CallbackContext;
// import android.app.Activity;

import android.view.Window;
import android.view.WindowManager;

// import org.json.JSONArray;
// import org.json.JSONException;
// import org.json.JSONObject;

// import android.content.Context;
// import android.os.Bundle;

import java.io.IOException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*;

/**
 * This class sets the FLAG_SECURE flag on the window to make the app
 *  private when shown in the task switcher
 */
public class PrivacyScreenPlugin extends CordovaPlugin {

  // @Override
  // public void initialize(CordovaInterface cordova, CordovaWebView webView) {
  //   super.initialize(cordova, webView);
  //   Activity activity = this.cordova.getActivity();
  //   activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);
  // }

  // @Override
  // public void initialize(CordovaInterface cordova, CordovaWebView webView) {
  //   super.initialize(cordova, webView);
  //   Window window = this.cordova.getActivity().getWindow();
  //   window.addFlags(WindowManager.LayoutParams.FLAG_SECURE);
  // }

  // @Override
  // public void onStart(boolean multitasking) {
  //   Window window = this.cordova.getActivity().getWindow();
  //   window.addFlags(WindowManager.LayoutParams.FLAG_SECURE);
  //   super.onStart(multitasking);
  // }

  @Override
  public void onPause(boolean multitasking) {
    Logger logger = Logger.getLogger("Test log");
    logger.info("onPause() triggered");
    // LOGGER.log(Level.INFO, "onPause() triggered");
    Window window = this.cordova.getActivity().getWindow();
    window.addFlags(WindowManager.LayoutParams.FLAG_SECURE);
    super.onPause(multitasking);
  }

  @Override
  public void onResume(boolean multitasking) {
    // LOGGER.log(Level.INFO, "onResume() triggered");
    Window window = this.cordova.getActivity().getWindow();
    window.clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
    super.onResume(multitasking);
  }
}
