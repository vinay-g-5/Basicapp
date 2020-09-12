package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvmsg;
    private ImageView ivmg;
    private EditText edmsg;
    private Button btncon;
    private ImageView ivrcb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvmsg=findViewById(R.id.tvMsg);
        ivmg=findViewById(R.id.ivmg);
        edmsg=findViewById(R.id.edMsg);
        btncon=findViewById(R.id.btnConfirm);
        ivrcb=findViewById(R.id.ivrcb);
        btncon.setOnClickListener(v -> {
        String msg=edmsg.getText().toString();

        if(msg.isEmpty()){
            Toast.makeText(this, "Message cn't be displayed!!", Toast.LENGTH_SHORT).show();
        }
        else{
            tvmsg.setText(msg);
        }
        }
    });
}
