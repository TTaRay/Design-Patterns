package com.citywy.pattern02;

/**
 * @author zhouhai
 * @date 2020/10/22 16:07
 * @company bbaqw
 */
public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
