package com.wang.factory.simplefactory;

/**
 * @author 王建起
 * @create 2020-09-22 14:43
 */

/**
 * 简单工厂模式又称静态工厂方法模式。重命名上就可以看出这个模式一定很简单。它存在的目的很简单：定义一个用于创建对象的接口。
 *       先来看看它的组成：
 *          1) 工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑，用来创建产品
 *          2) 抽象产品角色：它一般是具体产品继承的父类或者实现的接口。
 *          3) 具体产品角色：工厂类所创建的对象就是此角色的实例。在java中由一个具体类实现
 */



/**
 * 上来分析下简单工厂模式。当客户不再满足现有的车型号的时候，想要一种速度快的新型车，
 * 只要这种车符合抽象产品制定的合同， * 那么只要通知工厂类知道就可以被客户使用了。
 * 所以对产品部分来说，它是符合开闭原则的；但是工厂部分好像不太理想，因为每增加一种新型车，
 * 都要在工厂类中增加相应的创建业务逻辑（createBMW(int type)方法需要新增case），
 * 这显然是违背开闭原则的。可想而知对于新产品的加入，工厂类是很被动的。对于这样的工厂类，
 * 我们称它为全能类或者上帝类。
 */
public class Customer {
    public static void main(String[] args) {
        SimpleFactory simpleFactory=new SimpleFactory();
        BMW bmw320 = simpleFactory.createBMW(320);
        BMW bmw523 = simpleFactory.createBMW(523);


    }
}