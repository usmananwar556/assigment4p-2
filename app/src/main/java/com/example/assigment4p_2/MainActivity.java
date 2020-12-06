package com.example.assigment4p_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker= findViewById(R.id.datepick);
    }
    public void ShowDate(View V){
        int day=datePicker.getDayOfMonth();
        int month=datePicker.getMonth()+1;
        int year=datePicker.getYear();
        Toast.makeText(this, day+"-"+ month+"-"+year, Toast.LENGTH_SHORT).show();

    }
}