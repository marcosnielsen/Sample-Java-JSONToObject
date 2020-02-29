package com.softniels.jsontoobject;

import com.google.gson.Gson;

public class ParseJSONToWeatherEntity {

    public WeatherEntity JSONToObject (String value){
       Gson gson = new Gson();
        WeatherEntity weatherEntity = gson.fromJson(value, WeatherEntity.class);
        return  weatherEntity;
    }
}
