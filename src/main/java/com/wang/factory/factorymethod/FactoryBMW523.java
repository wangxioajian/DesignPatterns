package com.wang.factory.factorymethod;

/**
 * @author 王建起
 * @create 2020-09-22 15:12
 */
public class FactoryBMW523 implements FactoryBMW{
    @Override
    public BMW createBMW() {
        return new BMW523();
    }
}
