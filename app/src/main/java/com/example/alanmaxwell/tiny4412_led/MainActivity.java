package com.example.alanmaxwell.tiny4412_led;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mLedsOnOffBtn;
    private boolean ledOn=false;
    private CheckBox led1,led2,led3,led4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        led1= (CheckBox) findViewById(R.id.cb_led1);
        led2= (CheckBox) findViewById(R.id.cb_led2);
        led3= (CheckBox) findViewById(R.id.cb_led3);
        led4= (CheckBox) findViewById(R.id.cb_led4);
        mLedsOnOffBtn= (Button) findViewById(R.id.btn_led_on_off);
        mLedsOnOffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ledOn=!ledOn;
                if (ledOn){
                    mLedsOnOffBtn.setText("ALL OFF");
                    led1.setChecked(true);
                    led2.setChecked(true);
                    led3.setChecked(true);
                    led4.setChecked(true);
                }else {
                    mLedsOnOffBtn.setText("ALL ON");
                    led1.setChecked(false);
                    led2.setChecked(false);
                    led3.setChecked(false);
                    led4.setChecked(false);
                }
            }
        });
    }

    public void onCheckboxClicked(View view) {
        switch (view.getId()) {
            case R.id.cb_led1:
                if (led1.isChecked()) {
                    Toast.makeText(this,"LED1 ON",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this,"LED1 OFF",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.cb_led2:
                if (led2.isChecked()) {
                    Toast.makeText(this,"LED2 ON",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this,"LED2 OFF",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.cb_led3:
                if (led3.isChecked()) {
                    Toast.makeText(this,"LED3 ON",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this,"LED3 OFF",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.cb_led4:
                if (led4.isChecked()) {
                    Toast.makeText(this,"LED4 ON",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this,"LED4 OFF",Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
