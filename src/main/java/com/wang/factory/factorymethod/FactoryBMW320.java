package com.wang.factory.factorymethod;

/**
 * @author 王建起
 * @create 2020-09-22 15:11
 */
public class FactoryBMW320 implements FactoryBMW {

    @Override
    public BMW createBMW() {
        return new BMW320();
    }
}
