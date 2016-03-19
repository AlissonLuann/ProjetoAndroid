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

public class CompeticoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competicoes);
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
    public String Competicoes(){
        String  texto = "Competições de robôs reúnem construtores de robôs que competem para mostrar qual deles é capaz de cumprir da melhor forma um determinado objetivo especificado anteriormente a competição. As competições podem ser diferenciadas segundo alguns critérios básicos, a saber: \n" +
                "1. Os seus propósitos científicos e acadêmicos; \n" +
                "2. O grau de autonomia exigida dos protótipos de robôs para a realização das tarefas a eles solicitadas; \n" +
                "3. As restrições para a construção do protótipo, ou seja, o quão livre é a escolha das plataformas robóticas que podem ser empregadas na construção dos protótipos e a maneira como a organização da equipe está vinculada a iniciativas de instituições educacionais ou organizações formais.\n" +
                "\n"+
                "Algumas das competições de robôs são incluídas no amplo conceito de Olimpíadas Científicas pelo seu caráter de promover o estudo e difundir o conhecimento científico e tecnológico nas sociedades que as promovem. Entretanto, sob o ponto de vista, da análise que busca o agente a que se destina o desafio oferecido nas competições de robôs, esses eventos se diferenciam de todas as demais Olimpíadas Científicas tradicionais, pois o desafio deve ser resolvido, em última instância, pelo robô construído pelos inscritos na competição.\n" +
                "Apesar de parecer um detalhe o fato de o robô ser o agente final para a resolução do desafio proposto, esse aspecto determina uma grande transformação no conceito original de Olimpíada, por duas razões: \n" +
                "\n"+
                "1. O grau de autonomia do robô determina de forma equivalente o grau de distanciamento dos seus autores humanos do seu resultado efetivo, pois, se o robô é autônomo, os seus construtores humanos não podem interferir no seu desempenho durante as atividades que pratica na competição __ o que pode fazer com que, em breve, sistemas especialistas de grande porte, tenham mais efeito sobre o resultado do robô do que o seu estado inicial; \n" +
                "\n"+
                "2. Por ser um produto, o protótipo do robô exige mais do que os conhecimentos típicos das áreas de conhecimento naturalmente vinculadas à robótica, requer, de maneira determinante, o conhecimento e as práticas típicas do gerenciamento de projetos __ o que faz ficar evidente a necessidade de se administrar recursos finitos, experiência raramente observada em outras Olimpíadas Científicas tradicionais.\n" +
                "\n"+
                "Atualmente existem várias competições de robótica no mundo, as competições de robótica visam a, principalmente, estimular a pesquisa e o desenvolvimento na área de robótica como um todo, servindo muitas vezes como uma forma de colocar em prática os conhecimentos teóricos aprendidos por estudantes de áreas afins da engenharia e a troca de informações entre alunos e profissionais da área.\n" +
                "\n"+
                "Algumas competições de robótica para protótipos de robôs autônomos\n" +
                "•\tRoboCup - Competição Internacional: Abrangência Mundial. Conta com competições seletivas em mais de 40 países.\n" +
                "•\tRoboCup Junior - Competição Internacional: Abrangência Mundial. Evento integrado a RoboCup.\n" +
                "•\tWRO World Robotic Olympiad - Competição Internacional: Abrangência Mundial. Conta com competições seletivas em mais de 40 países.\n" +
                "•\tFIRA RoboWorld Cup - Competição Internacional: Abrangência Mundial. Conta com competições seletivas em mais de 30 países.\n" +
                "•\tDRC DARPA Robotics Challenge - Competição Internacional: Abrangência Mundial.\n" +
                "•\tLARC Latin-American Robotics Competition - Competição Internacional: Abrangência na América Latina.\n" +
                "•\tOBR Olimpíada Brasileira de Robótica- Competição Nacional: Abrangência Nacional. País: Brasil. Conta com a participação de mais de 1000 equipes.\n" +
                "•\tCBR Competição Brasileira de Robótica - Competição Nacional: Abrangência Nacional.País: Brasil. Conta com a participação de mais de 100 equipes.\n" +
                "•\tTJR Torneio Juvenil de Robótica- Competição Nacional: Abrangência Nacional. País: Brasil. Conta com a participação de mais de 500 equipes.\n";
        return texto;
    }
    public TextView textoView(){
        String texto = Competicoes();
        TextView tv =  ( TextView ) findViewById(R.id.textCompet );
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
        if (id == R.id.navigate){
            startActivity(new Intent(this,MainActivity.class));
        }


        return super.onOptionsItemSelected(item);
    }

}
