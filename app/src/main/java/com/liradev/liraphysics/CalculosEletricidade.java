package com.liradev.liraphysics;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalculosEletricidade extends AppCompatActivity {

    //Variáveis para calcular resistência(Ohm)
    private EditText txtUResistencia;
    private EditText txtIResistencia;

    //Variáveis para calcular potência(Watt)
    private EditText txtIPotencia;
    private EditText txtUPotencia;

    //Variáveis para calcular corrente(Ampère)
    private EditText txtUCorrente;
    private EditText txtRCorrente;

    //Variáveis para calcular Tensao(Volt)
    private EditText txtITensao;
    private EditText txtRTensao;


    //Variáveis praa calcular consumo(kWh)
    private EditText txtPConsumo;
    private EditText txtTConsumo;

    private double resultado;



    /*Fórmulas
     * P=I*U -> Potencia
     * R=U/I -> Resistencia
     * U=I*R -> Tensao
     * I=P/U -> Corrente
     *
     * C=(P/1000)*(^t[Horas])
     *
     * ex.: btnCalculaPotencia
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculos_eletricidade);

        txtUResistencia = (EditText) findViewById(R.id.txtUResistencia);
        txtIResistencia = (EditText) findViewById(R.id.txtIResistencia);

        txtIPotencia = (EditText) findViewById(R.id.txtIPotencia);
        txtUPotencia = (EditText) findViewById(R.id.txtUPotencia);

        txtUCorrente = (EditText) findViewById(R.id.txtUCorrente);
        txtRCorrente = (EditText) findViewById(R.id.txtRCorrente);

        txtITensao = (EditText) findViewById(R.id.txtITensao);
        txtRTensao = (EditText) findViewById(R.id.txtRTensao);

        txtPConsumo = (EditText) findViewById(R.id.txtPConsumo);
        txtTConsumo = (EditText) findViewById(R.id.txtTConsumo);
    }

    public void calcularResistencia(View v) {
        double uResistencia = Double.parseDouble(txtUResistencia.getText().toString());
        double iResistencia = Double.parseDouble(txtIResistencia.getText().toString());
        resultado = uResistencia/iResistencia;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("R = " + resultado + "Ω");
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void calcularPotencia(View v) {
        double iPotencia = Double.parseDouble(txtIPotencia.getText().toString());
        double uPotencia = Double.parseDouble(txtUPotencia.getText().toString());
        resultado = iPotencia*uPotencia;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("P = " + resultado + "W");
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void calcularCorrente(View v) {
        double uCorrente = Double.parseDouble(txtUCorrente.getText().toString());
        double rCorrente = Double.parseDouble(txtRCorrente.getText().toString());
        resultado = uCorrente/rCorrente;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("I =  " + resultado + "A");
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void calcularTensao(View v) {
        double iTensao = Double.parseDouble(txtITensao.getText().toString());
        double rTensao = Double.parseDouble(txtRTensao.getText().toString());
        resultado = iTensao*rTensao;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("U =  " + resultado + "V");
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void calcularConsumo(View v) {
        double pConsumo = Double.parseDouble(txtPConsumo.getText().toString());
        double tConsumo = Double.parseDouble(txtTConsumo.getText().toString());
        resultado = pConsumo/1000*tConsumo;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("C = " + resultado + "kWh");
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }
}
