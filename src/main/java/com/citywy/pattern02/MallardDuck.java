package com.citywy.pattern02;

/**
 * @author zhouhai
 * @date 2020/10/22 16:25
 * 野鸭，绿头鸭
 */
public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    public void display(){
        System.out.println("我是个绿头鸭");
        quackBehavior.quack();
        flyBehavior.fly();
    }

    public static void main(String[] args) {
        new MallardDuck().display();
    }
}
