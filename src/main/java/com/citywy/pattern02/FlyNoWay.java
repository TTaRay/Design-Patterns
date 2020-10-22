package com.citywy.pattern02;

/**
 * @author zhouhai
 * @date 2020/10/22 16:06
 * @company bbaqw
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
