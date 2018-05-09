package com.example.lenovo.helloworld;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
public class MainActivity extends Activity implements OnClickListener {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("myApp","onCreate has been called");
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("myApp","onStart has been called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("myApp","onResume has been called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("myApp","onPause has been called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("myApp","onRestart has been called");
    }
 /*  public void ButtonAction(View v)
    {Log.d("Button",v.getId()+"was clicked");}
  */
 @Override
 public void onClick(View v)
    {
        if(v.getId()==R.id.button1)
            Log.d("button","BUTTON1 WAS PRESSED");
        else if(v.getId()==R.id.button2)
            Log.d("button","BUTTON2 WAS PRESSED");

    }
 @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("myApp","onDestroy has been called");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d("CONFIG","CONFIGURATION CHANGED"+newConfig.orientation);
    }
}
