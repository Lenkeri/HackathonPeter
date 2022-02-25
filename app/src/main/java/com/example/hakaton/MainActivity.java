package com.example.hakaton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hakaton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
    }

    public static void main(String[] args) {

    }


}