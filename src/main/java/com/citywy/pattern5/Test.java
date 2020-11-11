package com.citywy.pattern5;

/**
 * @author zhouhai
 * @date 2020/11/11 12:19
 * @company bbaqw
 */
public class Test {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());

        //焦炒咖啡
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+"$"+beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
    }
}
