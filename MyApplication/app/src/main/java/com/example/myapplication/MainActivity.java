package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.myapplication.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private Button click;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(activity_main);

        name = findViewById(R.id.editText);
        click = findViewById(R.id.btn_click);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You have entered " + name.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

private addListenerRadioButton(){
    }
}

    private void addListenerRadioButton() {
    }

    rg1=(RadioG)
}