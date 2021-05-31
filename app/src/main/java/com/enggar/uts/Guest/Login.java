package com.enggar.uts.Guest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.enggar.uts.Admin.HomepageAdmin;
import com.enggar.uts.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends AppCompatActivity {
    @BindView(R.id.edtUsername) EditText edtUsername;
    @BindView(R.id.edtPassword) EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin) void submit() {
        String username = edtUsername.getText().toString();
        String password = edtPassword.getText().toString();

        if (username != null & password != null) {
            Intent i = new Intent(Login.this, HomepageAdmin.class);
            startActivity(i);
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Username & Password Salah", Toast.LENGTH_LONG).show();
        }


    }

    @OnClick(R.id.btnAkun) void login() {
        Intent i = new Intent(Login.this, Register.class);
        startActivity(i);
        finish();
    }
}