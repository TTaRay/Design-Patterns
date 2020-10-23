package com.citywy.pattern02;

/**
 * @author zhouhai
 * @date 2020/10/23 12:06
 * 火箭动力飞行
 */
public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("火箭动力飞行！");
    }
}
