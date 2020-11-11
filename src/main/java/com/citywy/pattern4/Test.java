package com.citywy.pattern4;


/**
 * @author zhouhai
 * @date 2020/11/4 17:08
 * @company bbaqw
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        //一个新的布告板
        CurrentConditionsDisplay ccd=new CurrentConditionsDisplay(weatherData);
        //新的气象测量
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,67,32.4f);
        weatherData.setMeasurements(84,69,34.4f);
    }
}
