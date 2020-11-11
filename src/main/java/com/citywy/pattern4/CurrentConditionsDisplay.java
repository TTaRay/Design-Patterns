package com.citywy.pattern4;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhouhai
 * @date 2020/11/6 9:21
 * @company bbaqw
 * 1号展示板
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    //将一号展示板对象登记为观察者
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("当前天气:"+temperature+"--"+humidity);
    }

}
