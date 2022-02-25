package com.example.hakaton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.hakaton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        binding.calculateButton.setOnClickListener(view -> setAnswer());
    }

    private void setAnswer() {
        String a = binding.textAField.getEditText().getText().toString();
        String b = binding.textBField.getEditText().getText().toString();
        String c = binding.textCField.getEditText().getText().toString();

        if ("".equals(a) || "".equals(b) || "".equals(c)) {
            return;
        }

        Double aField = Double.valueOf(a);
        Double bField = Double.valueOf(b);
        Double cField = Double.valueOf(c);

        Double D = bField * bField - 4 * aField * cField;

        if(D < 0){
            return;
        }
        int x1 = (int)((- bField + Math.sqrt(D) ) / 2 * aField);
        int x2 =  (int)((- bField - Math.sqrt(D) ) / 2 * aField);


        binding.x1TextView.setText("x1:" + x1);
        binding.x2TextView.setText("x2:" + x2);
    }


}