package com.example.ganjilgenapgame_1918097;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvBilangan;
    TextView tvPoin;
    Button btnGanjil;
    Button btnGenap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBilangan = findViewById(R.id.tvBilangan);
        tvPoin = findViewById(R.id.tvPoin);
        btnGanjil = findViewById(R.id.btnGanjil);
        btnGenap = findViewById(R.id.btnGenap);

        Random myRandom = new Random();
        int num = myRandom.nextInt(101);//0 - 100
        tvBilangan.setText(""+num);

        btnGanjil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (num % 2 == 0)
                    tvPoin.setText("-5");
                else
                    tvPoin.setText("5");
            }
        });

        btnGenap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (num % 2 == 0)
                    tvPoin.setText("5");
                else
                    tvPoin.setText("-5");
            }
        });
    }
}