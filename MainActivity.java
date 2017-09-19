package com.pranomvignesh.bmiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Result;
    EditText Height;
    EditText Weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result=(TextView) findViewById(R.id.Result);
        Height = (EditText) findViewById(R.id.Height);
        Weight = (EditText) findViewById(R.id.Weight);
    }
        public void CalculateBMI(View v){
        String heightStr=Height.getText().toString();
            String weightStr=Weight.getText().toString();
            if(heightStr!=null&&!"".equals(heightStr)&&weightStr!=null&&!"".equals(weightStr))
            {
                float heightvalue=Float.parseFloat(heightStr)/100;
                float weightvalue=Float.parseFloat(weightStr);
                float BMI= (heightvalue*heightvalue);
                BMI=weightvalue/BMI;
                if(BMI>0&&BMI<19)
                    Result.setText(Float.toString(BMI)+"\n Lean");
                else if (BMI>19&&BMI<25)
                    Result.setText(Float.toString(BMI)+"\n Fit");
                else if (BMI>25)
                    Result.setText(Float.toString(BMI)+"\n Obese");
                else
                    Result.setText("\nInvalid Value");
            }
            }


    }

