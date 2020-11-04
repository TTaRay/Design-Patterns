package com.citywy.pattern03;

/**
 * @author zhouhai
 * @date 2020/11/4 16:12
 * @company bbaqw
 * 实现观察者接口、布告板展示接口
 */
public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    //构造器需要weatherData对象(也就是主题)作为注册之用
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度等状态:"+temperature+"--"+humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        display();
    }
}
