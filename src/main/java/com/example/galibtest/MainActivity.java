package com.example.galibtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText IDText, HeightText, WeightText;
    TextView OutputView;
    Double num1, num2, Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IDText=findViewById(R.id.YourIDEditText);
        HeightText=findViewById(R.id.HightEditText);
        WeightText=findViewById(R.id.WeightEditText);
        OutputView=findViewById(R.id.OutputTextView);
    }

    public void popupFunction(View view) {
        String YourID =IDText.getText().toString();
        num1=Double.parseDouble(HeightText.getText().toString());
        num2=Double.parseDouble(WeightText.getText().toString());
        Result=((num2)/(num1*num1));
        OutputView.setText( "Hello " + YourID +  " , Your BMI is = " + Result);

    }
}