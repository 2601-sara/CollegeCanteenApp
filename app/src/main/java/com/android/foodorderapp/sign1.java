package com.android.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class sign1 extends AppCompatActivity implements View.OnClickListener{

    private TextInputEditText editTextnam;
    private TextInputEditText editTextregister;
    private TextInputEditText editTextemail;
    private TextInputEditText editTextnumber;
    private TextInputEditText editTextpass;

    private FirebaseFirestore db;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign1);

        auth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        editTextnam = findViewById(R.id.name);
        editTextregister = findViewById(R.id.registernumber);
        editTextemail = findViewById(R.id.mail);
        editTextnumber = findViewById(R.id.Phone);
        editTextpass = findViewById(R.id.Password);

        findViewById(R.id.button4).setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        String name = editTextnam.getText().toString().trim();
        int reg= Integer.parseInt(editTextregister.getText().toString().trim());
        int no= Integer.parseInt(editTextnumber.getText().toString().trim());
        String ma = editTextemail.getText().toString().trim();
        String pa = editTextpass.getText().toString().trim();



        CollectionReference dbReg = db.collection("court");
        regit Reg = new regit(
                name,
                reg,
                no,
                ma,
                pa
        );
        dbReg.add(Reg)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(sign1.this, "Product Added", Toast.LENGTH_LONG).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(sign1.this, e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
        Intent i1 = new Intent(this, SplashActivity.class);
        startActivity(i1);
    }


}