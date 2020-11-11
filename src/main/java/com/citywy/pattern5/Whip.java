package com.citywy.pattern5;

import java.math.BigDecimal;

/**
 * @author zhouhai
 * @date 2020/11/11 11:11
 * @company bbaqw
 * 具体装饰者(奶油)
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",奶油";
    }

    @Override
    public double cost() {
        return 0.6+beverage.cost();
    }
}
