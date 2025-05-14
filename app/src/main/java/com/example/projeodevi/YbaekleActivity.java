package com.example.projeodevi;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.projeodevi.databinding.YbaekleBinding;

public class YbaekleActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private YbaekleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = YbaekleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());





    }


}