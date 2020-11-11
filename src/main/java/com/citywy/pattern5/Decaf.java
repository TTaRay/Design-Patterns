package com.citywy.pattern5;

/**
 * @author zhouhai
 * @date 2020/11/11 10:46
 * @company bbaqw
 * 无咖啡因咖啡
 */
public class Decaf extends Beverage{
    public Decaf() {
        description="无咖啡因咖啡";
    }

    @Override
    public double cost() {
        return 0.29;
    }
}
