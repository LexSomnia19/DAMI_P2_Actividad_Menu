package com.example.actividadmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Practica3 extends AppCompatActivity {

    Button back;
    Button btnTablas;
    EditText IntroduceNumero;
    TextView SeMuestraTabla;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica3);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        IntroduceNumero = (EditText) findViewById(R.id.IntNumero);
        SeMuestraTabla = (TextView) findViewById(R.id.MostrarTablas);

        Button btnImprimirTabla = findViewById(R.id.btnImprimirTabla);

        btnImprimirTabla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cad = "";
                if (IntroduceNumero.getText().toString().equals("")) {
                    Toast.makeText(Practica3.this, "Ingrese un numero", Toast.LENGTH_SHORT).show();
                } else {
                    int numero = Integer.parseInt(IntroduceNumero.getText().toString());
                    for (int i = 1; i <= 10; i++) {
                        cad += String.valueOf(numero) + "\t X \t" + i + "\t = \t" + (numero * i) + "\n";
                    }
                    SeMuestraTabla.setText(cad);
                }
            }
        });





                /*for (int i = 1; i <= 10; i++){

                    multi += String.valueOf(numero) + "\t X \t" + i + "\t = \t" + (numero*i);


                }

                tablas.setText(multi);*/


        //---------------------------------------------------------------------------------------------------
        back = (Button) findViewById(R.id.comeback3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                    //codigo para el evento click

                    Intent intent = new Intent(Practica3.this, MainActivity.class);
                    startActivity(intent);

            }
        });
    }
}

