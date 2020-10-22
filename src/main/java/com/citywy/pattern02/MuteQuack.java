package com.citywy.pattern02;

/**
 * @author zhouhai
 * @date 2020/10/22 16:08
 * @company bbaqw
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
