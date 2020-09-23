package com.wang.singleton;

/**
 * @author 王建起
 * @create 2020-09-23 17:03
 * @Description: 双重检查
 */

/**
 * (1)Double-Check 概念是多线程开发中常使用到的，如代码中所示，两次if(singleton == null)检查
 * 这样就保证线程安全了
 * (2)这样实例化代码只用执行一次，后面再次放完到时，判断if(singleton == null 直接return 实例对象)，
 * 也避免了反复的方法同步
 * (3)线程安全; 延迟加载; 效率较高
 * (4)开发中推荐使用这种开发方式
 */
public class Singleton06 {

    private static  volatile Singleton06 instance;

    private  Singleton06(){

    }
    /**
     * 提供一个公有的静态方法，加入双重检查代码，解决线程安全问题，同事解决懒加载问题
     * 同时保证了效率，推荐使用
     */
    public static  synchronized  Singleton06 getInstance(){
        if (instance == null){
            synchronized (Singleton06.class){
                if (instance == null){
                    instance = new Singleton06();
                }
            }

        }
        return  instance;
    }

    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton06 instance = Singleton06.getInstance();
        Singleton06 instance2 = Singleton06.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}
