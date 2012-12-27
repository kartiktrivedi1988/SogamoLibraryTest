package com.SogamoTest;

import com.Sogamo.SogamoAPI;

import android.app.Activity;
import android.os.Bundle;

public class SogamoTest extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        SogamoAPI sogamoAPI = new SogamoAPI(this);
        sogamoAPI.startSessionWithAPIKey("e13e6a3595aa4287a6a14a3d0ee7df30");
    }
}