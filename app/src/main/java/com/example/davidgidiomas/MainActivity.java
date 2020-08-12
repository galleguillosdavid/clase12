package com.example.davidgidiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.prathameshmore.toastylibrary.Toasty;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    private String message;
    final Toasty toasty = new  Toasty(MainActivity.this);
    TextView m1;
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show();
        toasty.primaryToasty(this, "On Start", Toasty.LENGTH_LONG, Toasty.BOTTOM);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop", Toast.LENGTH_SHORT).show();
        toasty.primaryToasty(this, "On Stop", Toasty.LENGTH_LONG, Toasty.BOTTOM);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show();
        toasty.primaryToasty(this, "On Post Resume", Toasty.LENGTH_LONG, Toasty.BOTTOM);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "On Restart", Toast.LENGTH_SHORT).show();
        toasty.primaryToasty(this, "On Restart", Toasty.LENGTH_LONG, Toasty.BOTTOM);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show();
        toasty.primaryToasty(this, "On Destroy", Toasty.LENGTH_LONG, Toasty.BOTTOM);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.d("OnCreate");
        Toast.makeText(this, "On Create", Toast.LENGTH_SHORT).show();
        toasty.primaryToasty(this, "On Create", Toasty.LENGTH_LONG, Toasty.BOTTOM);
        TextView textView =findViewById(R.id.txt1);

        Button boton = findViewById(R.id.boton1);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            m1=findViewById(R.id.txt1);
            String mensaje1 = m1.getText().toString();

                toasty.primaryToasty(view.getContext(), mensaje1, Toasty.LENGTH_LONG, Toasty.BOTTOM);
            }

        });
        if(BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree());
        }



    }

}