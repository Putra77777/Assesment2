package org.d3if4065.assesment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView textHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editTextNumber1);
        editText2 = (EditText) findViewById(R.id.editTextNumber2);
        textHasil = (TextView) findViewById(R.id.textHasil);
        btnTambah = (Button) findViewById(R.id.buttonTambah);
        btnKurang = (Button) findViewById(R.id.buttonKurang);
        btnKali = (Button) findViewById(R.id.buttonKali);
        btnBagi = (Button) findViewById(R.id.buttonBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1, num2, result;
                num1 = Double.valueOf(editText1.getText().toString().trim());
                num2 = Double.valueOf(editText2.getText().toString().trim());
                result = num1+num2;
                String result1 = String.valueOf(result);
                textHasil.setText(result1);
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1, num2, result;
                num1 = Double.valueOf(editText1.getText().toString().trim());
                num2 = Double.valueOf(editText2.getText().toString().trim());
                result = num1-num2;
                String result1 = String.valueOf(result);
                textHasil.setText(result1);
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1, num2, result;
                num1 = Double.valueOf(editText1.getText().toString().trim());
                num2 = Double.valueOf(editText2.getText().toString().trim());
                result = num1*num2;
                String result1 = String.valueOf(result);
                textHasil.setText(result1);
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1, num2, result;
                num1 = Double.valueOf(editText1.getText().toString().trim());
                num2 = Double.valueOf(editText2.getText().toString().trim());
                result = num1/num2;
                String result1 = String.valueOf(result);
                textHasil.setText(result1);
            }
        });
    }
}
