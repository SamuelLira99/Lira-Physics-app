package com.liradev.liraphysics;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalcularDilatacao extends AppCompatActivity {

    //Variáveis para calcular dilatação linear
    private EditText l0Linear;
    private EditText aLinear;
    private EditText d0Linear;

    //Variáveis para calcular dilatação superficial
    private EditText s0Superficial;
    private EditText bSuperficial;
    private EditText d0Superficial;

    //Variáveis para calcular diltação volumétrica
    private EditText v0Volumetrica;
    private EditText yVolumetrica;
    private EditText d0Volumetrica;

    //Variáveis para calcular coeficiente de diltação superficial
    private EditText aCoeficienteSuperficial;

    //Variáveis para calcular coeficiente de diltação volumetrica
    private EditText aCoeficienteVolumetrica;

    //Variáveis para calcular diltação apatente
    private EditText v0Aparente;
    private EditText ylAparente;
    private EditText d0Aparente;

    //Variáveis para calcular diltação recipiente
    private EditText v0Recipiente;
    private EditText yrecRecipiente;
    private EditText d0Recipiente;

    //Variáveis para calcular dilatação real
    private EditText dVapReal;
    private EditText dVrecReal;

    //Variáveis para calcular coeficiente de dilatação real
    private EditText ylCoeficienteReal;
    private EditText yrecCoeicienteReal;

    //Variavel que armazena o resultado
    private double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcular_dilatacao);

        l0Linear = (EditText) findViewById(R.id.txtL0Linear);
        aLinear = (EditText) findViewById(R.id.txtALinear);
        d0Linear = (EditText) findViewById(R.id.txtD0Linear);

        s0Superficial = (EditText) findViewById(R.id.txtS0Superficial);
        bSuperficial = (EditText) findViewById(R.id.txtBSuperficial);
        d0Superficial = (EditText) findViewById(R.id.txtD0Superficial);

        v0Volumetrica = (EditText) findViewById(R.id.txtV0Volumetrica);
        yVolumetrica = (EditText) findViewById(R.id.txtYVolumetrica);
        d0Volumetrica = (EditText) findViewById(R.id.txtD0Volumetrica);

        aCoeficienteSuperficial = (EditText) findViewById(R.id.txtACoeficienteSuperficial);

        aCoeficienteVolumetrica = (EditText) findViewById(R.id.txtACoeficienteVolumetrica);

        v0Aparente = (EditText) findViewById(R.id.txtV0Aparente);
        ylAparente = (EditText) findViewById(R.id.txtYlAparente);
        d0Aparente = (EditText) findViewById(R.id.txtD0Aparente);

        v0Recipiente = (EditText) findViewById(R.id.txtV0Recipiente);
        yrecRecipiente = (EditText) findViewById(R.id.txtYrecRecipiente);
        d0Recipiente = (EditText) findViewById(R.id.txtD0Recipiente);

        dVapReal = (EditText) findViewById(R.id.txtDVapReal);
        dVrecReal = (EditText) findViewById(R.id.txtDVrecReal);

        ylCoeficienteReal =  (EditText) findViewById(R.id.txtYlCoeficienteReal);
        yrecCoeicienteReal = (EditText) findViewById(R.id.txtYrecCoeficienteReal);
    }

    public void calcularDilatacaoLinear(View v) {
        double l0 = Double.parseDouble(l0Linear.getText().toString());
        double a =  Double.parseDouble(aLinear.getText().toString());
        double d0 = Double.parseDouble(d0Linear.getText().toString());
        resultado = l0*a*d0;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("ΔL = " + resultado);
        dlg.setNeutralButton("Ok"   , null);
        dlg.show();
    }

    public void calcularDilatacaoSuperficial(View v) {
        double s0 = Double.parseDouble(s0Superficial.getText().toString());
        double b =  Double.parseDouble(bSuperficial.getText().toString());
        double d0 = Double.parseDouble(d0Superficial.getText().toString());
        resultado = s0*b*d0;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("ΔS = " + resultado);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void calcularDilatacaoVolumetrica(View v) {
        double v0 = Double.parseDouble(v0Volumetrica.getText().toString());
        double y =  Double.parseDouble(yVolumetrica.getText().toString());
        double d0 = Double.parseDouble(d0Volumetrica.getText().toString());
        resultado = v0*y*d0;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("ΔV = " + resultado);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void calcularCoeficienteSuperficial(View v) {
        double a = Double.parseDouble(aCoeficienteSuperficial.getText().toString());
        resultado = a*2;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("β = " + resultado);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void calcularCoeficienteVolumetrica(View v) {
        double a = Double.parseDouble(aCoeficienteVolumetrica.getText().toString());
        resultado = a*3;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("Y = " + resultado);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void calcularDilatacaoAparente(View v) {
        double v0 = Double.parseDouble(v0Aparente.getText().toString());
        double yl = Double.parseDouble(ylAparente.getText().toString());
        double d0 = Double.parseDouble(d0Aparente.getText().toString());
        resultado = v0*yl*d0;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("ΔVap = " + resultado);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void calcularDilatacaoRecipiente(View v) {
        double v0 =   Double.parseDouble(v0Recipiente.getText().toString());
        double yrec = Double.parseDouble(yrecRecipiente.getText().toString());
        double d0 =   Double.parseDouble(d0Recipiente.getText().toString());
        resultado = v0*yrec*d0;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("ΔVrec = " + resultado);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void calcularDilatacaoReal(View v) {
        double dVap =   Double.parseDouble(dVapReal.getText().toString());
        double dVrec = Double.parseDouble(dVrecReal.getText().toString());
        resultado = dVap+dVrec;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("ΔVreal = " + resultado);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void calcularCoeficienteReal(View v) {
        double yl =   Double.parseDouble(ylCoeficienteReal.getText().toString());
        double yrec = Double.parseDouble(yrecCoeicienteReal.getText().toString());
        resultado = yl+yrec;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("Yreal = " + resultado);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }
}
