package com.example.datepicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;
    Button button;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView1);
        button = (Button) findViewById(R.id.button1);
        datePicker = (DatePicker) findViewById(R.id.datePicker);

        textView.setText("Current Date : "+getCurrentDate());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("changed Date :"+getCurrentDate());
            }
        });

    }

    @NonNull
    private String getCurrentDate() {
        StringBuilder builder =new StringBuilder();
        builder.append((datePicker.getMonth()));
        builder.append(datePicker.getDayOfMonth());
        builder.append(datePicker.getYear());
        return builder.toString();
    }
}