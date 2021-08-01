package com.example.toolandparacalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button tool;
    Button par;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tool = (Button) findViewById(R.id.tools);
        tool.setOnClickListener(this);

        par = (Button) findViewById(R.id.parac);
        par.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tools:
                Intent intent = new Intent(this, Prizm_Tool.class);
                startActivity(intent);
                break;

            case R.id.parac:
                Intent intent1 = new Intent(this, Paracalc.class);
                startActivity(intent1);
                break;
            default:
                break;

        }
    }
}