package com.winelandsoft.jeroglificos.lib.app;


import android.app.Application;

public class AppJeroglificos extends Application {

	@Override
    public void onCreate() {
        super.onCreate();
        
        init();
    }


    private void init() {
        MyVolley.init(this);
    }
    
    
    
}
