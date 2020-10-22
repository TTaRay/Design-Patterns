package com.citywy.pattern01;

/**
 * @author zhouhai
 * @date 2020/10/21 11:21
 * @company bbaqw
 */
public abstract class Duck {
    void quack(){
        System.out.println("呱呱呱");
    }

    void swim(){
        System.out.println("拨清波");
    }

    abstract void display();
}
