package com.bca.mobile_programming.unit_3;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.bca.mobile_programming.R;

public class Login extends Activity {
    public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.lab_1_login);
    }

    protected void onStart(){
        super.onStart();
        Log.d("myStateLog", "About: OnStart");
    }

    protected void onResume(){
        super.onResume();
        Log.d("myStateLog", "About: onResume");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("myStateLog", "About: onRestart");
    }

    protected void onPause(){
        super.onPause();
        Log.d("myStateLog", "About: onPause");
    }

    protected void onStop(){
        super.onStop();
        Log.d("myStateLog", "About: onStop");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("myStateLog", "About: onDestroy");
    }

}
