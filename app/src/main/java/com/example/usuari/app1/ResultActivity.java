package com.example.usuari.app1;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/**
 * Created by usuari on 12/03/2018.
 */

class ResultActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView tvResultado=
                (TextView)this.findViewById(R.id.tvResultado);
        //obtenemos el Intent asociado
        Intent intent=this.getIntent();
        //recuperamos el dato enviado por la actividad principal
        int resultado=intent.getIntExtra("resultado",0);
        tvResultado.setText("Resultado: "+resultado);
    }
    public void volver(View v){
        //para vover a la actividad anterior
        //finalizamos al actividad
        this.finish();
    }
}
