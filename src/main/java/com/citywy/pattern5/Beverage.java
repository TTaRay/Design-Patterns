package com.citywy.pattern5;

/**
 * @author zhouhai
 * @date 2020/11/11 8:55
 * @company bbaqw
 */
public abstract class Beverage {
    String description = "未知的饮料";

    //描述已经在此实现，但是cost()必须子类中实现
    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
