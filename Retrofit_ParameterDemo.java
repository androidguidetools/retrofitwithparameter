package com.retrofitdemo.retrofitlearnigtopics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Retrofit_ParameterDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit__parameter_demo);
    }

    public void clickFruit(View view) {
        Intent intent = new Intent(Retrofit_ParameterDemo.this,CallRetrofitWithParameter.class);
        intent.putExtra("parameter","fruits");
        startActivity(intent);
    }

    public void clickCal(View view) {
        Intent intent = new Intent(Retrofit_ParameterDemo.this,CallRetrofitWithParameter.class);
        intent.putExtra("parameter","vegetables");
        startActivity(intent);
    }
}
