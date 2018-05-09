package com.demo.android.bmi_4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.text.DecimalFormat;

public class Bmi extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    //EditText field_height;
    //EditText field_weight;
    //TextView result;
    //TextView suggest;
    //Button submit;
    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Button submit = findViewById(R.id.submit);
        setContentView(R.layout.my_button_state);
        //findViews();
        //submit.setOnClickListener(this);
        tbtn = findViewById(R.id.toggleButton);
        tbtn.setOnCheckedChangeListener(this);
    }

    //private void findViews() { //導向物件欄位位置，注意名稱一定要相同
        //submit = findViewById(R.id.submit);
        //field_height = findViewById(R.id.field_height);
        //field_weight = findViewById(R.id.field_weight);
        //result = findViewById(R.id.result);
        //suggest = findViewById(R.id.suggest);
    //}
    /*@Override
    public void onClick(View v) {

        String height=field_height.getText().toString();
        String weight=field_weight.getText().toString();
        //欄位內容來源用使用者輸入(getText)取得
        DecimalFormat df=new DecimalFormat("0.00");
        double h=Double.parseDouble(height)/100;
        double w=Double.parseDouble(weight);
        double BMI=w/(h*h);

        result.setText("你的身體質量為"+df.format(BMI));

        if (BMI<18.5) {
            suggest.setText(R.string.advice_light);
        }else if (BMI>24.5){
            suggest.setText(R.string.advice_heavy);
        }else
            suggest.setText(R.string.advice_average);

    }*/

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked)
            Toast.makeText(Bmi.this,"now is on",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(Bmi.this,"now is off",Toast.LENGTH_SHORT).show();

    }
}
