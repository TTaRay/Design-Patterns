package com.citywy.pattern5;

/**
 * @author zhouhai
 * @date 2020/11/11 10:37
 * @company bbaqw
 * 浓缩咖啡
 */
public class Espresso extends Beverage{
    public Espresso() {
        description="浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
