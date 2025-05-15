package com.example.projeodevi;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.projeodevi.databinding.RegistersBinding;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class registers extends AppCompatActivity {
    FirebaseAuth mAuth;
    private AppBarConfiguration appBarConfiguration;
    private RegistersBinding binding;
    private Button Kaydet;
    private TextView etRegEmail, etRegPassword, etRegConfirmPassword;



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
                                         createUser();

                                     }
                                 }
        );
        etRegEmail = findViewById(R.id.textView7);
        etRegPassword = findViewById(R.id.textView8);
        etRegConfirmPassword = findViewById(R.id.textView9);

    }
 //Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
 private void createUser() {
     String email = etRegEmail.getText().toString().trim();
     String password = etRegPassword.getText().toString().trim();
     String confirmPassword = etRegConfirmPassword.getText().toString().trim();

     if (TextUtils.isEmpty(email)) {
         etRegEmail.setError("Email boş olamaz");
         etRegEmail.requestFocus();
     } else if (TextUtils.isEmpty(password)) {
         etRegPassword.setError("Şifre boş olamaz");
         etRegPassword.requestFocus();
     } else if (TextUtils.isEmpty(confirmPassword)) {
         etRegConfirmPassword.setError("Şifre tekrar boş olamaz");
         etRegConfirmPassword.requestFocus();
     } else if (!password.equals(confirmPassword)) {
         etRegConfirmPassword.setError("Şifreler eşleşmiyor");
         etRegConfirmPassword.requestFocus();
     } else {
         mAuth.createUserWithEmailAndPassword(email, password)
                 .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         if (task.isSuccessful()) {
                             Toast.makeText(registers.this, "Kayıt başarılı", Toast.LENGTH_SHORT).show();
                            // startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                             //finish();
                         } else {
                            // Toast.makeText(RegisterActivity.this, "Kayıt hatası: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                         }
                     }
                 });
     }
 }



}