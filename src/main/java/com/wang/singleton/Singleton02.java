package com.wang.singleton;

import java.sql.SQLOutput;

/**
 * @author 王建起
 * @create 2020-09-23 16:22
 * 饿汉式(静态代码块)
 * (1)这种方式和上述方式类似，只不过将类实例化的过程放在了静态代码块中，也就是在装载的时候执行静态代码中的代码，初始化类的实例
 *
 * 　(2)结论：单例方式可用，但可能会造成内存浪费
 */

public class Singleton02 {
    /**本类内部创建对象实例
     *
     */
    private static Singleton02 instance;
    /**
     * 构造器私有化，外部不能new
     */
    private  Singleton02(){

    }
    //静态代码块中，创建单例对象
    static {
        instance=new Singleton02();
    }

    /**
     * 提供一个公有静态方法，返回实例对象
     * @return
     */
    public static  Singleton02 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        //测试
        Singleton02 instance=Singleton02.getInstance();
        Singleton02 instance2=Singleton02.getInstance();
        System.out.println(instance==instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }

}
