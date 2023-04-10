package com.ytk.basithesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtBirinciSayi;
    EditText txtIkinciSayi;
    TextView txtSonuc;
    int sayi1, sayi2, sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtBirinciSayi = (EditText) findViewById(R.id.editTextBirinciSayi);
        txtIkinciSayi = (EditText) findViewById(R.id.editTextIkinciSayi);
        txtSonuc = (TextView) findViewById(R.id.textView3);
    }

    public void btnHesapla(View v) {
        if(!TextUtils.isEmpty(txtBirinciSayi.getText().toString()) && !TextUtils.isEmpty(txtIkinciSayi.getText().toString())) {
            sayi1 = Integer.valueOf(txtBirinciSayi.getText().toString());
            sayi2 = Integer.valueOf(txtIkinciSayi.getText().toString());
            Hesap hesap = new Hesap(sayi1, sayi2);

            switch (v.getId()) {
                case R.id.btnTopla:
                    sonuc = hesap.topla();
                    break;
                case R.id.btnCikar:
                    sonuc = hesap.cikar();
                    break;
                case R.id.btnBol:
                    sonuc = hesap.bol();
                    break;
                case R.id.btnCarp:
                    sonuc = hesap.carp();
                    break;
            }
            txtSonuc.setText(" SONUÇ :" + sonuc);
        }
        else{
            txtSonuc.setText("DEĞERLERİ DOĞRU GİRİNİZ");
        }
    }


}