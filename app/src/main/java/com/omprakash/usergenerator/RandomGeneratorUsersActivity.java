package com.omprakash.usergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.omprakash.usergenerator.databinding.ActivityRandomGeneratorUsersBinding;

public class RandomGeneratorUsersActivity extends AppCompatActivity {

    private ActivityRandomGeneratorUsersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRandomGeneratorUsersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}