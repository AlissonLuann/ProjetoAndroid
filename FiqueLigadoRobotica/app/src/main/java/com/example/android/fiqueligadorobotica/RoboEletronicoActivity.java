package com.example.android.fiqueligadorobotica;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class RoboEletronicoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roboeletronico);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView();


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public String texto1(){
        String texto ="Se há alguma área na Campus Party Brasil em que o silêncio impera, é a de Robótica. Configurada de uma maneira diferente das outras zonas na Arena - normalmente, " +
                "\n" +"os computadores são postos em \"tiras\" pelo pavilhão, mas, em Robótica, a divisão das mesmas obedece um \"jogo da velha\" - o silêncio vem da concentração para transformar " +
                "\n"+"quilos de sucata e \"lixo\" eletrônico em mini robôs que podem andar sozinhos.";
        return texto;
    }
    public TextView textView(){
        String texto = texto1();
        TextView tv =  ( TextView ) findViewById(R.id.textLixoEletronico );
        tv.setText(texto);
        return tv;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.navigate){
            startActivity(new Intent(this,MainActivity.class));
        }


        return super.onOptionsItemSelected(item);
    }

}
