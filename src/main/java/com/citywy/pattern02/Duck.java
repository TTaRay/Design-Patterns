package com.citywy.pattern02;

/**
 * @author zhouhai
 * @date 2020/10/22 16:20
 * 鸭子类，作为父类，有飞行和叫两种行为变量
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 执行飞行
     */
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

}
