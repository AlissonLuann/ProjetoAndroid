package com.example.android.fiqueligadorobotica;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ProjetoArduinoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projetoarduino);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView();
        textView1();
        textView2();
        textVie3();


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public String texto1(){
        String texto ="Arduíno é uma plataforma de hardware e software abertos para criação de protótipos. " +
                "\n"+"Apesar das palavras técnicas, o sistema consiste em um conjunto de técnicas padronizadas para criação de pequenos sistemas eletroeletrônicos simples," +
                "\n"+" que podem ser programados pelo seu criador. Idealizado por um italiano, o sistema tem a intenção de popularizar a criação e uso desse tipo de tecnologia por pessoas sem largo conhecimento técnico.";

        return texto;
    }
    public String texto2(){
        String texto ="Você gosta de acessórios diferentes para o seu quarto? Ou quem sabe que fazer uma luminária legal para as festas que você faz com seus amigos. " +
                "\n"+"Aparentemente complexo, o cubo de LED é estruturalmente fácil de ser construído e colocado em operação, segundo seu desenvolvedor. " +
                "\n"+"Com ele você pode criar animações e letreiros com apenas alguns conceitos de Arduíno.";
        return texto;
    }
    public String texto3(){
        String texto ="Com cada vez mais ciclistas pelas ruas das nossas cidades, a preocupação com a segurança dos mesmos aumentou bastante." +
                "\n"+" Com esse sistema Arduíno simples, você pode ter uma roupa com sinalização para que possa indicar para aonde está se movendo, " +
                "\n"+"de modo a garantir sua segurança no transito.";
        return texto;
    }
    public String texto4(){
        String texto ="Depois desse nosso ultimo exemplo projeto Arduíno (e do cubo de LEDs) não faltará quase nada para você montar uma boa festa na sua casa. Esse projeto é um pouco mais complexo que a maioria dos mostrados acima e serve para mostrar como você pode ter um sistema Arduíno funcionando como parte de uma plataforma maior.\n" +
                "\n" +
                "Nesse sistema você pode montar uma maquina automática de drinks, na qual você poderá colocar vários tipos de bebidas para serem misturadas e servidas. Aliado ao sistema Arduíno de quantidade de bebidas a serem misturadas e servidas foi ligado um computador no qual a pessoa que escolher o drink que quiser beber pode fazer login no Facebook e postar a receita do drink que está tomando.\n" +
                "\n" +
                "Gostou dos projetos Arduíno que mostramos acima, mas não sabe como pode começar a criar algo parecido? O Learncafe possúi um curso específico para você aprender a construir sistemas e programar nesta linguagem. Inscreva-se em nosso curso online de Arduino!";
        return texto;
    }
    public TextView textView(){
        String texto = texto1();
        TextView tv =  ( TextView ) findViewById(R.id.textprojeto );
        tv.setText(texto);
        return tv;
    }
    public TextView textView1(){
        String texto = texto2();
        TextView tv1 =  ( TextView ) findViewById(R.id.textcubo );
        tv1.setText(texto);
        return tv1;
    }
    public TextView textView2(){
        String texto = texto3();
        TextView tv2 =  ( TextView ) findViewById(R.id.textjaqueta );
        tv2.setText(texto);
        return tv2;
    }
    public TextView textVie3(){
        String texto = texto4();
        TextView tv3 =  ( TextView ) findViewById(R.id.textbar );
        tv3.setText(texto);
        return tv3;
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
