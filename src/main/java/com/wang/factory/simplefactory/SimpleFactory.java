package com.wang.factory.simplefactory;



/**
 * @author 王建起
 * @create 2020-09-22 14:45
 */
public class SimpleFactory {
    public BMW createBMW(int type){
        switch (type){
            case 320 :
                return new BMW320();
            case 523:
                return new BMW523();
            default:
                break;
        }
        return null;
    }
}
