package com.example.android.fiqueligadorobotica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        textView();


    }

    public String texto1(){
        String texto ="Nesse Tutorial você ficará por dentro de tudo sobre o mundo da robótica.\n" +
                      "Aqui você irá aprender sobre :";
        return texto;
    }
    public TextView textView(){
            String texto = texto1();
        TextView tv =  ( TextView ) findViewById(R.id.text_texto );
        tv.setText(texto);
        return tv;
    }
    public void historia(View view){
        startActivity(new Intent(this, HistoriaActivity.class));
    }
    public void competicao(View view){
        startActivity(new Intent(this,CompeticoesActivity.class));
    }
    public void eletronico(View view){
        startActivity(new Intent(this,RoboEletronicoActivity.class));
    }
    public void fazerRobor(View view){
        startActivity(new Intent(this,AprenderRoboActivity.class));
    }
    public void Projeto(View view){
        startActivity(new Intent(this,ProjetoArduinoActivity.class));
    }


}
