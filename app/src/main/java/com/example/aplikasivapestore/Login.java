package com.example.aplikasivapestore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText editText1,editText2;
    String text,Txtpw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginMasuk(View view){
        editText1 = (EditText) findViewById(R.id.Username);
        editText2 = (EditText) findViewById(R.id.Password);
        text = editText1.getText().toString();
        Txtpw = editText2.getText().toString();

        if ((text.contains("Admin"))&&((Txtpw.contains("pas123")))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        }

        else if ((text.matches("")||Txtpw.matches("")))
          /*
          Atau jika input text 1 dan text 2 kosong
           */
        {
            //Maka akan menampilkan pesan text toast
            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show();

        }

        else {
            //jika kedua kondisi diatas tidak memenuhi

            Toast.makeText(this, "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show();
        }

    }
}
