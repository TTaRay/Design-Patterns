package com.citywy.pattern4;

import java.util.Observable;

/**
 * @author zhouhai
 * @date 2020/11/5 17:03
 * @company bbaqw
 * 继承可观察者Observable
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    //数据改变更新观察者数据值,setChanged和notifyObservers
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    //设置气象站检测到的温度 湿度 气压并更新(添加、修改...)
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
