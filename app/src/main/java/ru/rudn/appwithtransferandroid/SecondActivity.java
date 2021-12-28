package ru.rudn.appwithtransferandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button back;
    private TextView name;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        back = findViewById(R.id.back_button);
        name = findViewById(R.id.nametxt);

        String txtName = getIntent().getStringExtra("name");

        name.setText(name.getText().toString() + " " + txtName);
    }

    @SuppressLint("NonConstantResourceId")
    public void back(View v){
        if (v.getId() == R.id.back_button) {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        }
    }
}