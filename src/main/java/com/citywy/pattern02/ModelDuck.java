package com.citywy.pattern02;

/**
 * @author zhouhai
 * @date 2020/10/23 11:19
 * @company bbaqw
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior=new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display(){
        System.out.println("我是模型鸭子");
        flyBehavior.fly();
        quackBehavior.quack();
    }

}
