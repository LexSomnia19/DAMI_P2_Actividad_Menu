package com.example.actividadmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Practica1 extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica1);


     //Se introduce el año

        Button comprobacionanio = findViewById(R.id.comprobacionanio);

        comprobacionanio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView respuesta = findViewById(R.id.respuesta);

                EditText anio = findViewById(R.id.anio);

                String aniointroducido = anio.getText().toString();

                int anios = Integer.parseInt(aniointroducido);

                if ((anios % 4 == 0) && (anios % 100 != 0 || anios % 400 == 0)) {

                    respuesta.setText("El año es bisiesto");
                }
                    else{


                    respuesta.setText("El año no es bisiesto");
                }

            }
        });




//---------------------------------------------------------------------------------------------------

        //Se comprueba el boton

        back = (Button) findViewById(R.id.comeback1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //codigo para el evento click

                Intent intent = new Intent(Practica1.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}