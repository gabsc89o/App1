package com.example.usuari.app1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void calcular(View v){
        EditText edtNumero=(EditText)this.findViewById(R.id.edtNumero);
        TextView tvResultado=(TextView)this.findViewById(R.id.tvResultado);
        //convertimos el valor de texto a número
        int num=Integer.parseInt(edtNumero.getText().toString());
        int res=1;
        //calculamos el factorial y lo mostramos en el TextView
        for(int i=1;i<=num;i++){
            res*=i;
        }
        //creación del objeto Intent asociado a la nueva actividad
        Intent intent=new Intent(this,ResultActivity.class);
        //guardamos el resultado de la operación
        intent.putExtra("resultado",res);
        //lanzamiento de la actividad
        this.startActivity(intent);
    }
   /* public void saludar(View v) {
        //obtenemos una referencia al control campo de texto
        EditText nombre = (EditText) this.findViewById(R.id.edtNombre);
        //obtenemos una referencia al control que
        //mostrará el mensaje de saludo
        TextView saludo = (TextView) this.findViewById(R.id.tvSaludo);
        //recuperamos el contenido del campo de texto
//y formamos el mensaje de saludo
        String texto = "Bienvenido Sr./a " + nombre.getText();
        //volcamos el mensaje en el TextView
        saludo.setText(texto);
    }*/
}
