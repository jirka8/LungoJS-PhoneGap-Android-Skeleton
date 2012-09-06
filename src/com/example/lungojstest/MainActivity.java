package com.example.lungojstest;

import android.os.Bundle;
import org.apache.cordova.*;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {    	
    	super.onCreate(savedInstanceState);
    	super.setStringProperty("loadingDialog", "Loading app...");
    	super.loadUrl("file:///android_asset/www/index.html");    	
    	
    	super.appView.setVerticalScrollBarEnabled(false);
    	super.appView.setHorizontalScrollBarEnabled(false);
    }

}
