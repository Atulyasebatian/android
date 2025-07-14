package com.example.myapplication;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_main);

    Button loginButton = findViewById(R.id.button);

    loginButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        EditText n = findViewById(R.id.editTextText);
        EditText p = findViewById(R.id.editTextTextPassword);
        String name = n.getText().toString();
        String password = p.getText().toString();

        if (name.equals("admin") && password.equals("1234")) {
          Toast.makeText(MainActivity.this, "succesfull", Toast.LENGTH_SHORT).show();
        } else {
          Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_SHORT).show();
        }
      }
    });
  }
}




