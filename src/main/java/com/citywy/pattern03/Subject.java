package com.citywy.pattern03;

/**
 * @author zhouhai
 * @date 2020/11/3 15:30
 * @company bbaqw
 * 主题接口（可观察者）
 */
public interface Subject {
    //注册和移除观察者方法都需要形参(观察者实例)
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    //主题状态改变时，这个方法会被调用，以通知所有的观察者
    public void notifyObservers();
}
