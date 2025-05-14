package com.example.projeodevi;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.projeodevi.databinding.ActivitySelectedArtistBinding;

public class selected_artist extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySelectedArtistBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySelectedArtistBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());





    }


}