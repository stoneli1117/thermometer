package com.example.thermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        Button enter = (Button) findViewById(R.id.enter);
        EditText TempEnter = (EditText) findViewById(R.id.TempEnter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float TE = Float.parseFloat(TempEnter.getEditableText().toString());
                float F;
                F = TE*9/5+32;
                TextView message = (TextView) findViewById(R.id.result);
                message.setText("華氏溫度為"+F );
            }
        });
    }
}