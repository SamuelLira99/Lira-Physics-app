package com.liradev.liraphysics;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sPreferences = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Função que Verifica se é a primeira execução do app
        sPreferences = getSharedPreferences("firstRun", MODE_PRIVATE);

        if (sPreferences.getBoolean("firstRun", true)) {
            sPreferences.edit().putBoolean("firstRun", false).apply();

            AlertDialog.Builder dlgFirstLaunch = new AlertDialog.Builder(this);
            dlgFirstLaunch.setMessage(getString(R.string.dlgFirst));
            dlgFirstLaunch.setNeutralButton("Ok", null);
            dlgFirstLaunch.show();

            AlertDialog.Builder dlgInicial = new AlertDialog.Builder(this);
            dlgInicial.setMessage(getString(R.string.dlgInicial));
            dlgInicial.setNeutralButton("Ok", null);
            dlgInicial.show();
        }//Fim da Função



        /*AlertDialog.Builder mensagemInicial = new AlertDialog.Builder(this);
        mensagemInicial.setMessage("ATENÇÃO! Este app ainda está sendo desenvolvido e não está pronto, por isso, alguns recursos não estarão disponíveis no momento.");
        mensagemInicial.setNeutralButton("Ok", null);
        mensagemInicial.show();

        Toast.makeText(getApplicationContext(), "Atualizações em Breve.", Toast.LENGTH_SHORT).show();*/
    }

    public void abreConversor(View v) {
        Intent tela = new Intent(this, ConversorTermomagnetico.class);
        startActivity(tela);
    }

    public void abreEletricidade(View v) {
        Intent tela = new Intent(this, CalculosEletricidade.class);
        startActivity(tela);
    }

    public void abreRelatividade(View v) {
        Intent tela = new Intent(this, TeoriaRelatividade.class);
        startActivity(tela);
    }

    public void abreDilatacao(View v) {
        Intent tela = new Intent(this, CalcularDilatacao.class);
        startActivity(tela);
    }

    public void abreAceleracao(View v) {
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage(R.string.dlgBreve);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void abreForca(View v) {
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage(R.string.dlgBreve);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void abreAtrito(View v) {
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage(R.string.dlgBreve);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void abreEnergia(View v) {
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage(R.string.dlgBreve);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void abreImpulso(View v) {
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage(R.string.dlgBreve);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void abreGravitacao(View v) {
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage(R.string.dlgBreve);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void abreEntropia(View v) {
        Intent tela = new Intent(this, CalcularEntropia.class);
        startActivity(tela);
    }

    public void abreFormulas(View v) {
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage(R.string.dlgBreve);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void desenvolvedor(View v) {
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("Desenvolvido por Samuel Lira");
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void doar(View v) {
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setTitle("Doar BTC");
        dlg.setMessage(R.string.dlgBTC);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void ajudarTraducao(View v) {
        Intent tela = new Intent(this, Traducao.class);
        startActivity(tela);
    }


}


/*
*
* //Função que Verifica se é a primeira execução do app
        sPreferences = getSharedPreferences("firstRun", MODE_PRIVATE);

        if (sPreferences.getBoolean("firstRun", true)) {
            sPreferences.edit().putBoolean("firstRun", false).apply();
            Toast.makeText(getApplicationContext(), "primeiro launcher", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "segundo? terceiro?...", Toast.LENGTH_LONG).show();
        }//Fim da função
*/