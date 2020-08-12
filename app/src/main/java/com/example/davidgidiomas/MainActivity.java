package com.example.davidgidiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.prathameshmore.toastylibrary.Toasty;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    final Toasty toasty = new  Toasty(MainActivity.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView =findViewById(R.id.txt1);

        Button boton = findViewById(R.id.boton1);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                toasty.primaryToasty(view.getContext(), "La tercera es la Vencida", Toasty.LENGTH_LONG, Toasty.BOTTOM);
            }
        });
        if(BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree());
        }



    }
   /* protected  void onStart(){
        super.onStar();
        Timber.d("OnStart");
    }*/
}