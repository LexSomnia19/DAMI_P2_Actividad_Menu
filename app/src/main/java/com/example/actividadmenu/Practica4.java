package com.example.actividadmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Practica4 extends AppCompatActivity {

     Button back;
     double promedio = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica4);

         Button btnPromedio = findViewById(R.id.btnPromedio);

        btnPromedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // busco el valor en el EditText de cada materia
                EditText materia1 = findViewById(R.id.materia1);
                EditText materia2 = findViewById(R.id.materia2);
                EditText materia3 = findViewById(R.id.materia3);
                EditText materia4 = findViewById(R.id.materia4);
                EditText materia5 = findViewById(R.id.materia5);

                //Los convierto en string
                String calificacion_espanol = materia1.getText().toString();
                String calificacion_matematicas = materia2.getText().toString();
                String calificacion_ciencias_sociales = materia3.getText().toString();
                String calificacion_quimica = materia4.getText().toString();
                String calificacion_ingles = materia5.getText().toString();

                /*int espanol = Integer.parseInt(calificacion_espanol);
                int matematicas = Integer.parseInt(calificacion_matematicas);
                int ciencias_sociales = Integer.parseInt(calificacion_ciencias_sociales);
                int quimica = Integer.parseInt(calificacion_quimica);
                int ingles = Integer.parseInt(calificacion_ingles);

                int promedio = ((espanol + matematicas + ciencias_sociales + quimica + ingles) / 5);*/

                //Los vuelvo valores Double para poder hacer calculos
                double espanol= Double.parseDouble(calificacion_espanol);
                double matematicas = Double.parseDouble(calificacion_matematicas);
                double ciencias_sociales = Double.parseDouble(calificacion_ciencias_sociales);
                double quimica = Double.parseDouble(calificacion_quimica);
                double ingles = Double.parseDouble(calificacion_ingles);

                promedio = ((espanol + matematicas + ciencias_sociales + quimica + ingles)  / 5);

                if (promedio > 90) {
                    Toast.makeText(Practica4.this, "Tu promedio es de: "+promedio+ "\n¡Eres buen Alumno! :D", Toast.LENGTH_SHORT).show();
                }

                if (promedio < 90 && promedio > 80) {
                    Toast.makeText(Practica4.this, "Tu promedio es de: "+promedio+ "\n¡Vas bien, pero debes mejorar! :)", Toast.LENGTH_SHORT).show();
                }

                if (promedio < 80 && promedio > 70) {
                    Toast.makeText(Practica4.this, "Tu promedio es de: "+promedio+ "\n¡Estas aprobando de panzazo! :|", Toast.LENGTH_SHORT).show();
                }

                if (promedio < 70 ) {
                    Toast.makeText(Practica4.this, "Tu promedio es de: "+promedio+ "\n¡Ya fuiste...! :(", Toast.LENGTH_SHORT).show();
                }
            }
    });

                //Se comprueba el boton

                back = (Button) findViewById(R.id.comeback4);
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //codigo para el evento click

                        Intent intent = new Intent(Practica4.this, MainActivity.class);
                        startActivity(intent);

                    }
                });
            }
        }