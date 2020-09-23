package com.wang.singleton;

/**
 * @author 王建起
 * @create 2020-09-23 17:22
 * Description: 静态内部类
 */

/**
 *(1)这种方式采用了类装载的机制来保证初始化实例时只有一个线程
 *
 * (2)静态内部类方式在Singleton07类（外部类）被装载时并不会立即实例化，而是在需要实例化时，调用getInstance()方法，才会装载SingletonInstance类，从而完成Singleton的实例化
 *
 * (3)类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 *
 * (4)优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 *
 * 　(5)结论：推荐使用
 */
public class Singleton07 {
    private static  volatile  Singleton07 instance;

    //构造器私有化
    private Singleton07(){

    }
    //写一个静态内部类，该类中有一个静态属性 Singleton
    private  static  class SingletonInstance{
        private static final  Singleton07 INSTANCE = new Singleton07();
    }
    /**
     * 提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
     */
    public static synchronized  Singleton07 getInstance(){
        return  SingletonInstance.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton07 instance = Singleton07.getInstance();
        Singleton07 instance2 = Singleton07.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }


}
