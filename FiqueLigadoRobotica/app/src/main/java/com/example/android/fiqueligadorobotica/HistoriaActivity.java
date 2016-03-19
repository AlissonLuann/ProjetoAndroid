package com.example.android.fiqueligadorobotica;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class HistoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        textoView();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public String Historia() {
        String texto = " O conceito de robot data dos inícios da história, quando os mitos faziam referência a mecanismos que ganhavam vida.\n " +
                "\n" +
                "Começando na civilização grega, os primeiros modelos de robot que encontramos eram figuras com aparência humana e/ou animal, que usavam sistemas de pesos e bombas pneumáticas.\n" +
                "\n" +
                "As civilizações daquele tempo não tinham nenhuma necessidade prática ou económica, nem nenhum sistema complexo de produtividade que exigisse a existência deste tipo de aparelhos.\n" +
                "\n" +
                "Cientistas árabes acrescentaram um importante e novo conceito à ideia tradicional de robots, concentrando as suas pesquisas no objectivo de atribuir funções aos robots que fossem ao encontro das necessidades humanas. A fusão da ideia de robots e a sua possível utilização prática marcou o início de uma nova era.\n" +
                "\n" +
                "Leonardo DaVinci abriu caminho a uma maior aproximação ao complexo mundo dos robots. DaVinci desenvolveu uma extensiva investigação no domínio da anatomia humana que permitiu o alargamento de conhecimentos para a criação de articulações mecânicas. Como resultado deste estudo desenvolvido, surgiram diversos exemplares de bonecos que moviam as mãos, os olhos e as pernas, e que conseguiam realizar acções simples como escrever ou tocar alguns instrumentos.\n" +
                "\n" +
                "Nikola Tesla, cientista na área da robótica, emigrou da Croácia para a América em 1800 e a propósito do grande desenvolvimento dos robots e das grandes expectativas criadas em redor destes, afirmou: \"I treated the whole field broadly, not limiting myself to mechanics controlled from a distance, but to machines possessed of their own intelligence. Since that time had advanced greatly in the evolution of the invention and think that the time is not distant when I shall show an automation which left to itself, will act as though possessed of reason and without any willful control from the outside.\" A palavra robot foi introduzida pelo dramaturgo Karel Capek. Esta palavra surgiu numa das suas mais prestigiadas peças, R.U.R, e os robots que nela intervieram não eram mecanizados.\n" +
                "\n" +
                "O termo robótica refere-se ao estudo e à utilização de robots, e foi pela primeira vez enunciado pelo cientista e escritor Isaac Asimov, em 1942, numa pequena história intitulada \"Runaround\". Asimov também publicou uma compilação de pequenas histórias, em 1950, intitulada \"I Robot\". Este autor propôs a existência de três leis aplicáveis à robótica, às quais acrescentou, mais tarde, a lei zero. As leis propostas são, actualmente, entendidas numa perspectiva puramente ficcional, pois no tempo em que foram escritas não se imaginava o desenvolvimento vertiginoso que iria ocorrer nesta área. Os robots, tal como os conhecemos hoje, não procuram ser verdadeiras imitações humanas, nem pretendem ser outras formas de vida.\n" +
                "\n" +
                "O desenvolvimento inicial dos robots baseou-se no esforço de automatizar as operações industriais. Este esforço começou no século XVIII, na indústria têxtil, com o aparecimento dos primeiros teares mecânicos. Com o contínuo progresso da revolução industrial, as fábricas procuraram equipar-se com máquinas capazes de realizar e reproduzir, automaticamente, determinadas tarefas. No entanto, a criação de verdadeiros robots não foi possível até à invenção do computador em 1940, e dos sucessivos aperfeiçoamentos das partes que o constituem, nomeadamente, em relação à dimensão.\n" +
                "\n" +
                "O primeiro robot industrial foi o Unimates, desenvolvido por George Devol e Joe Engleberger, no final da década de 50, início da década de 60. As primeiras patentes de máquinas transportadoras pertenceram a Devol, máquinas essas que eram robots primitivos que removiam objectos de um local para outro. Engleberger, por sua vez, pela construção do primeiro robot comercial foi apelidado de \"pai da robótica\". Outro dos primeiros computadores foi o modelo experimental chamado Shakey, desenhado para pesquisas em Standford, no final da década de 60.\n" +
                "\n" +
                "Actualmente, robots como o Shakey continuam a ser utilizados, particularmente com intuitos de pesquisa, mas, no futuro, estes computadores podem vir a ser utilizados como veículos de reconversão ambiental.";
        return texto;

    }

    public TextView textoView() {
        String texto = Historia();
        TextView tv = (TextView) findViewById(R.id.textHistoria);
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

        /*if (id == R.id.navigate2) {
            startActivity(new Intent(this, MainActivity.class));
            return true;
        }*/


        if (id == R.id.navigate) {
            startActivity(new Intent(this,  MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

}
