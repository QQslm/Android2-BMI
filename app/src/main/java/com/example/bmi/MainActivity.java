package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float bmi;
    EditText height;                //宣告全域變數
    EditText weight;                //宣告全域變數

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight = findViewById(R.id.editTextTextPersonName);// 取得體重物件
        height = findViewById(R.id.editTextTextPersonName2);// 取得身高物件

    }
    public void calculate(View view) {
        if ( !("".equals(height.getText().toString())
                || "".equals(weight.getText().toString())) )
        {

            TextView BMI = findViewById(R.id.textView);
            float WEIGHT = Float.parseFloat(weight.getEditableText().toString());
            float HEIGHT = Float.parseFloat(height.getEditableText().toString());
            bmi = WEIGHT / (HEIGHT * HEIGHT);
            //TextView BMI = findViewById(R.id.textView);
            BMI.setText("" + bmi);//BMI更改為計數器msg的資料
            //BMI.setText(editText.getText().toString());BMI更改為editText的字串
        }
    }
}