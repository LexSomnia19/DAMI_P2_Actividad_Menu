package com.example.actividadmenu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            btn1 = (Button) findViewById(R.id.button1);
            btn2 = (Button) findViewById(R.id.button2);
            btn3 = (Button) findViewById(R.id.button3);
            btn4 = (Button) findViewById(R.id.button4);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //codigo para el evento click

                        Intent intent = new Intent(MainActivity.this, Practica1.class);
                        startActivity(intent);

            }
        });


                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //codigo para el evento click

                        Intent intent = new Intent(MainActivity.this, Practica2.class);
                        startActivity(intent);

            }
        });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //codigo para el evento click

                        Intent intent = new Intent(MainActivity.this, Practica3.class);
                        startActivity(intent);

            }
        });

                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //codigo para el evento click

                        Intent intent = new Intent(MainActivity.this, Practica4.class);
                        startActivity(intent);

            }
        });
    }
}