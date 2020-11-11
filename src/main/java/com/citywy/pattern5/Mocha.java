package com.citywy.pattern5;

/**
 * @author zhouhai
 * @date 2020/11/11 11:11
 * @company bbaqw
 * 具体装饰者(摩卡)
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",摩卡";
    }

    @Override
    public double cost() {
        return 0.1+beverage.cost();
    }
}
