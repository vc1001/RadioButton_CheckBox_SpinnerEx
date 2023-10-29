package com.example.radiobutton_checkbox_spinner_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup,radioGroup1;
    CheckBox checkBox;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radio);
        radioGroup1=findViewById(R.id.radio1);
        checkBox = findViewById(R.id.checkbox);
        spinner = findViewById(R.id.spinner);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                if (radioButton.isChecked()){
                    Toast.makeText(MainActivity.this, "you select"+radioButton.getText().toString(), Toast.LENGTH_SHORT).show();

                }
            }
        });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean CheckId) {
                if (checkBox.isChecked()){
                    Toast.makeText(MainActivity.this, "you select"+checkBox.getText().toString(), Toast.LENGTH_SHORT).show();
                
                }else {
                    Toast.makeText(MainActivity.this, "You Not Select", Toast.LENGTH_SHORT).show();

                }

            }
        });
        Integer [] Number = {1,2,3,4,5};
        ArrayAdapter<Integer>adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,Number);
        spinner.setAdapter(adapter);

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup1, int CheckedId) {
                RadioButton radioButton = findViewById(CheckedId);

                if (radioButton.isChecked()){
                    Toast.makeText(MainActivity.this, "You Selected"+radioButton.getText().toString(), Toast.LENGTH_SHORT).show();

                }

            }
        });
                


    }
}