package com.wang.factory.abstractfactory;

/**
 * @author 王建起
 * @create 2020-09-22 17:35
 */

//空调以及型号
public interface Aircondition {
}
class AirconditionA implements Aircondition {
    public AirconditionA(){
        System.out.println("制造-->AirconditionA");
    }
}
class AirconditionB implements Aircondition {
    public AirconditionB(){
        System.out.println("制造-->AirconditionB");
    }
}


