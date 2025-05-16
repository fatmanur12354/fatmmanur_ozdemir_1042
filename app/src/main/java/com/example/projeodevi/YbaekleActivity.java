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
                                         //Intent i = new Intent(YbaekleActivity.this, result.class);
                                        // startActivity(i);
                                         insertData();
                                     }
                                 }




        );

        //biladisoyadi2
        //ulkesis
        //url
        //dt
        //ot
        //eserileri



    }

    private void insertData() {


        // String adisoyadi = biladisoyadi2.getText().toString();
        // String ulkesi = ulkesis.getText().toString();
        //String bilimadami = spinnerCourses.getSelectedItem().toString();

        //String id = db.push().getKey();

        //Badami Badamis = new Badami(id,name,rollno,course);
        // assert id != null;
        // db.child(id).setValue(students);
        Toast.makeText(YbaekleActivity.this,"Data eklendi!",Toast.LENGTH_SHORT).show();

    }



}