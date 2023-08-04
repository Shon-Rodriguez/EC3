package com.shon.ec3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.shon.ec3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnGetStarted.setOnClickListener(view ->{

            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();

        });

        binding.txtRestaurantPhrase.setText(R.string.get_started_title);
    }
}