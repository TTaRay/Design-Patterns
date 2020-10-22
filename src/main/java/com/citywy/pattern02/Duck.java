package com.citywy.pattern02;

/**
 * @author zhouhai
 * @date 2020/10/22 16:20
 * @company bbaqw
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

}
