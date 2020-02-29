package com.softniels.jsontoobject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String jsonValue;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.myLabel);
        WeatherEntity weatherEntity;

        ParseJSONToWeatherEntity ParseJSONToWeatherEntity = new ParseJSONToWeatherEntity();
        this.jsonValue = "{\"by\":\"default\",\"valid_key\":false}";
        weatherEntity = ParseJSONToWeatherEntity.JSONToObject(this.jsonValue);
        Log.i("weatherEntity", weatherEntity.getBy());
        if (weatherEntity.getValid_key()) {
            textView.setText("Chave valida");
            Log.i("weatherEntity", "Chave valida");
        } else {
            textView.setText("A Chave é inválida");
            Log.i("weatherEntity", "Chave inválida");
        }
    }
}
