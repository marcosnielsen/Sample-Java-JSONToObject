package com.softniels.jsontoobject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String jsonValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WeatherEntity weatherEntity;

        JSONToObject JSONToObject = new JSONToObject();
        this.jsonValue = "{\"by\":\"default\",\"valid_key\":false}";
        weatherEntity = JSONToObject.JSONToObject(this.jsonValue);
        Log.i("weatherEntity", weatherEntity.getBy());
        if (weatherEntity.getValid_key()) {
            Log.i("weatherEntity", "Chave valida");
        } else {
            Log.i("weatherEntity", "Chave inválida");
        }
    }
}
