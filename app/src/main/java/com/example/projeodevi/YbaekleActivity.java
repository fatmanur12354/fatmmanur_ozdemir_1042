package com.example.projeodevi;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.projeodevi.databinding.YbaekleBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class YbaekleActivity extends AppCompatActivity {
    private Button kaydet;

    private AppBarConfiguration appBarConfiguration;
    private YbaekleBinding binding;
    EditText Dt,Ot,Eserleri,ulkesi,adisoyadi,url;
    FirebaseFirestore db = FirebaseFirestore.getInstance();    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = YbaekleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Dt = findViewById(R.id.dt);
        Ot = findViewById(R.id.ot);
        Eserleri = findViewById(R.id.eserleri);
        adisoyadi = findViewById(R.id.biladisoyadi2);
        ulkesi=findViewById(R.id.ulkesis);
        url=findViewById(R.id.url);

        kaydet = findViewById(R.id.button);

        kaydet.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {

                                         insertData();
                                     }
                                 }




        );





    }

    private void insertData() {
        String adisoyadiget = adisoyadi.getText().toString();
        String ulkesiget = ulkesi.getText().toString();
        String urlget = url.getText().toString();
        String dtget = Dt.getText().toString();
        String otget = Ot.getText().toString();
        String Eserleriget = Eserleri.getText().toString();

        String id = db.collection("Bilimadamlari").document().getId();

        Badami badamis = new Badami(id, adisoyadiget, ulkesiget, urlget, dtget, otget, Eserleriget);

        db.collection("kullanicilar")
                .document(id)
                .set(badamis)
                .addOnSuccessListener(aVoid ->
                        Toast.makeText(YbaekleActivity.this, "Veri eklendi!", Toast.LENGTH_SHORT).show()
                )
                .addOnFailureListener(e ->
                        Toast.makeText(YbaekleActivity.this, "Hata: " + e.getMessage(), Toast.LENGTH_SHORT).show()
                );
    }




}