package com.citywy.pattern5;

/**
 * @author zhouhai
 * @date 2020/11/11 10:46
 * @company bbaqw
 * 首选咖啡
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description="首选咖啡";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
