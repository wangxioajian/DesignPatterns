package com.wang.factory.factorymethod;

/**
 * @author 王建起
 * @create 2020-09-22 15:13
 */
public class Customer {
    public static void main(String[] args) {
        FactoryBMW factoryBMW320 = new FactoryBMW320();
        BMW bmw320 =  factoryBMW320.createBMW();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW523 bmw523 = (BMW523) factoryBMW523.createBMW();
    }
}
