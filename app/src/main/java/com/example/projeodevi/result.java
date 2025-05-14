package com.example.projeodevi;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.projeodevi.databinding.ActivityResultBinding;

public class result extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityResultBinding binding;
//button4
        private Button ybadamiekle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ybadamiekle = findViewById(R.id.button4);
        ybadamiekle.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent i = new Intent(result.this,selected_artist.class);
                                         startActivity(i);

                                     }
                                 }
        );

    }


}