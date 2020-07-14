package com.liradev.liraphysics;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalcularEntropia extends AppCompatActivity {

    //private EditText txtDS;
    private EditText txtQ;
    private EditText txtT;
    private double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcular_entropia);

        txtQ = (EditText) findViewById(R.id.txtQ);
        txtT = (EditText) findViewById(R.id.txtT);
    }

    public void calcularVariacaoEntropia(View v) {
        double q = Double.parseDouble(txtQ.getText().toString());
        double t = Double.parseDouble(txtT.getText().toString());
        resultado = q/t;

        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("ΔS = " + resultado);
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }
}
