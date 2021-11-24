package com.example.checkbox;

import static com.example.checkbox.R.id.eman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox maheen, eman, anaya, nimra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maheen = findViewById(R.id.checkBox1);
        maheen.setOnClickListener(this);
        eman = findViewById(R.id.checkBox2);
        eman.setOnClickListener(this);
        anaya = findViewById(R.id.checkBox3);
        anaya.setOnClickListener(this);
        nimra = findViewById(R.id.checkBox4);
        nimra.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.checkBox1:
                Toast.makeText(this, "are u girl", Toast.LENGTH_SHORT).show();
                eman.setChecked(false);
                anaya.setChecked(false);
                nimra.setChecked(false);
                break;


            case R.id.checkBox2:
                Toast.makeText(this, "are you student", Toast.LENGTH_SHORT).show();
                maheen.setChecked(false);
                anaya.setChecked(false);
                nimra.setChecked(false);

                break;
            case R.id.checkBox3:
                Toast.makeText(this, "do you have insta id", Toast.LENGTH_SHORT).show();
                eman.setChecked(false);
                maheen.setChecked(false);
                nimra.setChecked(false);
                break;

            case R.id.checkBox4:
                Toast.makeText(this, "are you yang", Toast.LENGTH_SHORT).show();
                eman.setChecked(false);
                maheen.setChecked(false);
                anaya.setChecked(false);
                break;
        }


    }
}