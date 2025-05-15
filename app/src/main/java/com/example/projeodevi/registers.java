package com.example.projeodevi;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.projeodevi.databinding.RegistersBinding;
import com.google.firebase.auth.FirebaseAuth;

public class registers extends AppCompatActivity {
    FirebaseAuth mAuth;
    private AppBarConfiguration appBarConfiguration;
    private RegistersBinding binding;
    private Button Kaydet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = RegistersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Kaydet = findViewById(R.id.button3);
        mAuth = FirebaseAuth.getInstance();
        Kaydet.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         registerfunc();

                                     }
                                 }
        );


    }

    private void registerfunc() {
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
    }


}