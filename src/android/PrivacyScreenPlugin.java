/**
 * PrivacyScreenPlugin.java Cordova Plugin Implementation
 * Created by Tommy-Carlos Williams on 18/07/14.
 * Copyright (c) 2014 Tommy-Carlos Williams. All rights reserved.
 * MIT Licensed
 *
 * Updated by Patrícia Ferreira on 14/08/2020
 */
package org.devgeeks.privacyscreen;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.os.Bundle;

/**
 * This class sets the FLAG_SECURE flag on the window to make the app
 *  private when shown in the task switcher
 */
public class PrivacyScreenPlugin extends CordovaPlugin {
  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);
    Activity activity = this.cordova.getActivity();
    activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);
  }
  
   @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("addFlag")) {
            this.addFlag(callbackContext);
            return true;
        } else if (action.equals("removeFlag")) {
            this.removeFlag(callbackContext);
            return true;
          }
        return false;
      }

  private void addFlag() {
    Activity activity = this.cordova.getActivity();
    activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);
  }
  
  private void removeFlag() {
    Activity activity = this.cordova.getActivity();
    activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
      
  }
}