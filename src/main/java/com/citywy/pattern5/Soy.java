package com.citywy.pattern5;

/**
 * @author zhouhai
 * @date 2020/11/11 11:11
 * @company bbaqw
 * 具体装饰者(豆奶)
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",豆奶";
    }

    @Override
    public double cost() {
        return 0.4+beverage.cost();
    }
}
