package com.liradev.liraphysics;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class ConversorTermomagnetico extends AppCompatActivity {

    private Spinner spnEscala1;
    private Spinner spnEscala2;
    private EditText txtValor;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conversor_termomagnetico);

        spnEscala1 = (Spinner) findViewById(R.id.spnEscala1);
        spnEscala2 = (Spinner) findViewById(R.id.spnEscala2);
        txtValor = (EditText) findViewById(R.id.txtValor);

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.escalas01, android.R.layout.simple_spinner_item);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.escalas02, android.R.layout.simple_spinner_item);
        spnEscala1.setAdapter(adapter1);
        spnEscala2.setAdapter(adapter2);
    }

        public void calcula(View v) {

            String escala1 = spnEscala1.getSelectedItem().toString();
            String escala2 = spnEscala2.getSelectedItem().toString();
            double valor =   Double.parseDouble(txtValor.getText().toString());

            /*
            * C->F  °F = °C × 1,8 + 32
            * F->C  °C = (°F − 32) / 1,8
            * C->K   K = °C + 273,15
            * K->C  °C = K − 273,15
            * K->F  °F = K × 1,8 – 459,67
            * F->K   K = (°F + 459,67) / 1,8.
            */

            if((escala1.equals("ºC")) && (escala2.equals("ºF"))) {
                resultado = valor*1.8+32;
            }else if((escala1.equals("ºF")) && (escala2.equals("ºC"))) {
                resultado = (valor-32)/1.8;
            }else if((escala1.equals("ºC"))&&(escala2.equals("K"))) {
                resultado = valor+273.15;
            }else if((escala1.equals("K")) && (escala2.equals("ºC"))) {
                resultado = valor-273.15;
            }else if((escala1.equals("K")) && (escala2.equals("ºF"))) {
                resultado = valor*1.8-459.67;
            }else if((escala1.equals("ºF")) && (escala2.equals("K"))) {
                resultado = (valor+459.67)/1.8;
            }

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage(valor + escala1 + " = " + resultado + escala2);
            dlg.setNeutralButton("Ok", null);
            dlg.show();



    }

    /*public void inverterEscalas(View v) {
        String escala1 = spnEscala1.getSelectedItem().toString();
        String escala2 = spnEscala2.getSelectedItem().toString();

        escala1.setItem;
        Toast.makeText(getApplicationContext(), "Escalas invertidas com sucesso.");
    }*/




}
