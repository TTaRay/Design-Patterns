package com.citywy.pattern02;

/**
 * @author zhouhai
 * @date 2020/10/22 16:06
 * @company bbaqw
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("翅膀咔咔飞");
    }
}
