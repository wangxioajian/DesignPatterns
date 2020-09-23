package com.wang.factory.abstractfactory;

/**
 * @author 王建起
 * @create 2020-09-22 17:27
 */
//发动机以及型号
public interface Engine {

}
 class EngineA implements Engine{
    public EngineA(){
        System.out.println("制造-->EngineA");
    }
}

 class EngineB implements Engine {
    public EngineB(){
        System.out.println("制造-->EngineB");
    }
}





