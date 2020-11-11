package com.citywy.pattern03;

import com.citywy.pattern03.CurrentConditionDisplay;
import com.citywy.pattern03.WeatherData;

/**
 * @author zhouhai
 * @date 2020/11/4 17:08
 * @company bbaqw
 */
public class Test {
    public static void main(String[] args) {
        com.citywy.pattern03.WeatherData weatherData = new WeatherData();
        //一个新的布告板
        CurrentConditionDisplay ccd=new CurrentConditionDisplay(weatherData);
        //新的气象测量
        weatherData.setMeasurements(80,65,30.4f);
    }
}
