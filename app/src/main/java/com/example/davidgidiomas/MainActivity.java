package com.example.davidgidiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.prathameshmore.toastylibrary.Toasty;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView =findViewById(R.id.txt1);


        if(BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree());
        }

        final Toasty toasty = new  Toasty(MainActivity.this);
        toasty.primaryToasty(this, "La tercera es la Vencida", Toasty.LENGTH_LONG, Toasty.BOTTOM);
    }
   /* protected  void onStart(){
        super.onStar();
        Timber.d("OnStart");
    }*/
}