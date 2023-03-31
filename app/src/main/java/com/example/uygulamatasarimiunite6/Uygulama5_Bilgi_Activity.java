package com.example.uygulamatasarimiunite6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uygulama5_Bilgi_Activity extends AppCompatActivity {
    TextView txtViewAdSoyad, txtViewEposta, txtViewTelefon;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama5_bilgi_activity);

        txtViewAdSoyad = findViewById(R.id.txtViewAdSoyad);
        txtViewAdSoyad = findViewById(R.id.txtViewEposta);
        txtViewTelefon = findViewById(R.id.txtViewTelefon);

        Intent intent = getIntent();
        Bilgiler bilgiler = (Bilgiler) intent.getSerializableExtra("Bilgiler");
        txtViewAdSoyad.setText(bilgiler.getAdiSoyadi());
        txtViewEposta.setText(bilgiler.geteMail());
        txtViewTelefon.setText(bilgiler.getTelefonNo());

    }
}
