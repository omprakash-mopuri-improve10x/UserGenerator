package com.omprakash.usergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.omprakash.usergenerator.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleRandomGeneratorUsersBtn();
    }

    private void handleRandomGeneratorUsersBtn() {
        binding.generateRandomUsersBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, RandomGeneratorUsersActivity.class);
            startActivity(intent);
        });
    }
}