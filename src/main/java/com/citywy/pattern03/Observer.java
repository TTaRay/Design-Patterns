package com.citywy.pattern03;

/**
 * @author zhouhai
 * @date 2020/11/3 15:32
 * @company bbaqw
 * 观察者接口
 */
public interface Observer {
    //所有观察者必须实现update()方法，以实现观察者接口
    public void update(float temp,float humidity,float pressure);//温度 湿度 气压
}
