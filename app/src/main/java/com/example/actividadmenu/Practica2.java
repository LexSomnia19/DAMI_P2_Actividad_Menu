package com.example.actividadmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Practica2 extends AppCompatActivity {

        Button back;

        int contadorX = 0;
        int contadorY = 0;


        TextView y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica2);

         setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //boton arriba
         Button arriba = findViewById(R.id.arriba);
         arriba.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 TextView y = findViewById(R.id.y);
                 contadorY++;
                 y.setText("Coordenada Y: "+contadorY);
                 TextView mensajeFinal = findViewById(R.id.coordenada_final);
         mensajeFinal.setText("Coordenada final del personaje: \n"
                 + " X: " + contadorX + " Y: " + contadorY);

             }

         });

         //Boton abajo
          Button abajo = findViewById(R.id.abajo);
         abajo.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 TextView y = findViewById(R.id.y);
                 contadorY--;
                 y.setText("Coordenada Y: "+contadorY);
                 TextView mensajeFinal = findViewById(R.id.coordenada_final);
         mensajeFinal.setText("Coordenada final del personaje: \n"
                 + " X: " + contadorX + " Y: " + contadorY);
             }
         });

         //Boton derecha
          Button derecha = findViewById(R.id.derecha);
         derecha.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 TextView x = findViewById(R.id.x);
                 contadorX++;
                 x.setText("Coordenada X: "+contadorX);
                 TextView mensajeFinal = findViewById(R.id.coordenada_final);
         mensajeFinal.setText("Coordenada final del personaje: \n"
                 + " X: " + contadorX + " Y: " + contadorY);
             }
         });

          //Boton izquierda
          Button izquierda = findViewById(R.id.izquierda);
         izquierda.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 TextView x = findViewById(R.id.x);
                 contadorX--;
                 x.setText("Coordenada X: "+contadorX);

                   TextView mensajeFinal = findViewById(R.id.coordenada_final);
         mensajeFinal.setText("Coordenada final del personaje: \n"
                 + " X: " + contadorX + " Y: " + contadorY);
             }
         });



         //---------------------------------------------------------------------------------------------------
        back = (Button) findViewById(R.id.comeback2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //codigo para el evento click

                Intent intent = new Intent(Practica2.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}