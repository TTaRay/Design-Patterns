package com.citywy.pattern02;

/**
 * @author zhouhai
 * @date 2020/10/23 11:23
 * @company bbaqw
 */
public class Test {
    public static void main(String[] args) {
//        new MallardDuck().display();
        Duck d = new ModelDuck();
        d.performFly();
        //模型鸭动态改变了行为，从不会飞变成火箭动力飞行
        d.setFlyBehavior(new FlyRocketPowered());
        d.performFly();
    }
}
