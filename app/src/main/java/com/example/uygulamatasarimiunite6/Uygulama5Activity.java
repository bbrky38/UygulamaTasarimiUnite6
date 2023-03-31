package com.example.uygulamatasarimiunite6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uygulama5Activity extends AppCompatActivity {
    EditText txtAdSoyad, txtEposta, txtSifre;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama5_activity);

        txtAdSoyad = findViewById(R.id.txtAdSoyad);
        txtEposta = findViewById(R.id.txtEposta);
        txtSifre = findViewById(R.id.txtSifre);
    }
    public void btnGiris(View view){
        String adiSoyadi = txtAdSoyad.getText().toString();
        String eposta = txtEposta.getText().toString();
        String sifre = txtSifre.getText().toString();
        Bilgiler bilgilerSerializable = new Bilgiler(adiSoyadi , eposta , sifre);
        Intent intent = new Intent(this.getApplicationContext(), Uygulama5Activity.class);
        intent.putExtra("Bilgiler", bilgilerSerializable);
        startActivity(intent);
    }
}
