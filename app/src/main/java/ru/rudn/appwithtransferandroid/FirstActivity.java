package ru.rudn.appwithtransferandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        name = findViewById(R.id.name);
    }

    @SuppressLint("NonConstantResourceId")
    public void goNewView(View v){
        if (v.getId() == R.id.btnActTwo) {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("name", name.getText().toString());
            startActivity(intent);
        }
    }
}