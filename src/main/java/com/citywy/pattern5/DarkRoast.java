package com.citywy.pattern5;

/**
 * @author zhouhai
 * @date 2020/11/11 10:46
 * @company bbaqw
 * 焦炒咖啡
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description="焦炒咖啡";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
