package com.shon.ec3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.shon.ec3.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(view -> {

            String email = binding.tilEmail.getEditText().getText().toString();
            String password = binding.tilPassword.getEditText().getText().toString();;

            if (email.equals("ejemploe@idat.com.pe") && password.equals("Peru12345678")) { // Agregar el correo del destinatario
                Toast.makeText(this, "Ingresando", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, PrincipalActivity.class);
                intent.putExtra(PrincipalActivity.EMAIL, binding.tilEmail.getEditText().getText().toString());
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "Credenciales no válidas", Toast.LENGTH_SHORT).show();
            }
        });

        binding.tilEmail.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                boolean isOk =  isCredentialsValidate(s.toString(), binding.tilPassword.getEditText().getText().toString());
                binding.btnLogin.setEnabled(isOk);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.tilPassword.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                boolean isOk =  isCredentialsValidate(binding.tilEmail.getEditText().getText().toString(), s.toString());
                binding.btnLogin.setEnabled(isOk);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
    private boolean isCredentialsValidate(String email, String password){
        boolean isEmailOk = !email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches(); //Validar el Email
        boolean isPasswordOk = password.length() >= 8; // Valida que la contra sera mayor o igual a 8 caracteres
        return isEmailOk && isPasswordOk;
    }
}