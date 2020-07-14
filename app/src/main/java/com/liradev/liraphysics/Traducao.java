package com.liradev.liraphysics;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Traducao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.traducao);
    }

    public void baixarAlemao(View v) {
        String url = "http://www.tutotudo.com/Strings/de-strings.xml";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void baixarEspanhol(View v) {
        String url = "http://www.tutotudo.com/Strings/es-strings.xml";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void baixarJapones(View v) {
        String url = "http://www.tutotudo.com/Strings/ja-strings.xml";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void baixarFrances(View v) {
        String url = "http://www.tutotudo.com/Strings/fr-strings.xml";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void baixarIngles(View v) {
        String url = "http://www.tutotudo.com/Strings/en-strings.xml";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
