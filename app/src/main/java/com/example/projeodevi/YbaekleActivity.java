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

import com.example.projeodevi.databinding.YbaekleBinding;
import com.google.firebase.firestore.FirebaseFirestore;

public class YbaekleActivity extends AppCompatActivity {
    private Button kaydet;
    private AppBarConfiguration appBarConfiguration;
    private YbaekleBinding binding;
    FirebaseFirestore db = FirebaseFirestore.getInstance();    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = YbaekleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        kaydet = findViewById(R.id.button);
        kaydet.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent i = new Intent(YbaekleActivity.this, result.class);
                                         startActivity(i);

                                     }
                                 }
        );




    }


}