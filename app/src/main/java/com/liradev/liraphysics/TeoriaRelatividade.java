package com.liradev.liraphysics;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TeoriaRelatividade extends AppCompatActivity {

    private EditText txt1DeltaT;
    private EditText txt1Velocidade;
    private EditText txt2DeltaTLinha;
    private EditText txt2Velocidade;
    private EditText txt3DeltaTLinha;
    private EditText txt3DeltaT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teoria_relatividade);

        AlertDialog.Builder mensagemInicial = new AlertDialog.Builder(this);
        mensagemInicial.setMessage("Esta função ainda está incompleta, por favor, aguarde a próxima atualização.");
        mensagemInicial.setNeutralButton("Ok", null);
        mensagemInicial.show();

        txt1DeltaT =      (EditText) findViewById(R.id.txt1DeltaT);
        txt1Velocidade =  (EditText) findViewById(R.id.txt1Velocidade);

        txt2DeltaTLinha = (EditText) findViewById(R.id.txt2DeltaTLinha);
        txt2Velocidade =  (EditText) findViewById(R.id.txt2Velocidade);

        txt3DeltaT =      (EditText) findViewById(R.id.txt3DeltaT);
        txt3DeltaTLinha = (EditText) findViewById(R.id.txt3DeltaTLinha);

    }//Δt'=Δt√(1-(v²/c²))


    public void calcularDeltaTLinha(View v) {
        double deltaT =      Double.parseDouble(txt1DeltaT.getText().toString());
        double velocidade =  Double.parseDouble(txt1Velocidade.getText().toString());
        double velocidade2 = Math.pow(velocidade, 2);
        double luz2 =        Math.pow(300000000, 2);
        double raiz =        Math.sqrt(1-velocidade2/luz2);

        double resultado = deltaT*raiz;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("Δt' = " + resultado);
        dlg.setNeutralButton("Ok", null);
        dlg.show();

    }

    public void calcularDeltaT(View v) {
        //double DeltaTLinha = Double.parseDouble(txt2DeltaTLinha.getText().toString());
        //double velocidade =  Double.parseDouble(txt2Velocidade.getText().toString());

       //double resultado;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("Em Breve");
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void calcularVelocidade(View v) {
        //double DeltaT =  Double.parseDouble(txt3DeltaT.getText().toString());
        //double DeltaTLinha = Double.parseDouble(txt3DeltaTLinha.getText().toString());

        //double resultado;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("Em Breve");
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }
}
