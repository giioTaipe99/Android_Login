package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private String user = "user";
    private String pass = "pass";
    private EditText user1;
    private EditText pass1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.botonLogin);

        user1 = (EditText) findViewById(R.id.editName);
        pass1 = (EditText) findViewById(R.id.editPassword);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user1.getText().toString().equals(user) && pass1.getText().toString().equals(pass)){
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }else{
                    Log.d("Msg", "cagaste bro");
                    Log.d("User",user1.getText().toString() + pass1.getText().toString());
                }
            }
        });
    }
}