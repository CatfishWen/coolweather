package com.coolweather.android.gson;

/**
 * Created by wen on 2018/1/8.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
