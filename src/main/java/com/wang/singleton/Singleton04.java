package com.wang.singleton;

/**
 * @author 王建起
 * @create 2020-09-23 16:45
 * @Description: 懒汉式(同步方法保证线程安全)
 * (1)解决线程安全问题
 *
 * (2)效率太低了，每个线程在想获得类的实例的时候，执行getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面的想要获得该类实例，直接return就行了，方法同步效率太低了。
 *
 * (3)结论：在实际开发中，不推荐使用这种方式
 *
 */
public class Singleton04 {

    private static Singleton04 instance;

    private Singleton04() {}

    /**
     * 提供一个静态方法的公有方法，加入同步处理的代码，解决线程安全问题
     * 即懒汉式
     */
    public static synchronized Singleton04 getInstance(){
        if (instance == null){
            instance = new Singleton04();
        }
        return  instance;

    }

    public static void main(String[] args) {
        System.out.println("懒汉式2 ， 线程安全~");
        Singleton04 instance = Singleton04.getInstance();
        Singleton04 instance2 = Singleton04.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }


}
