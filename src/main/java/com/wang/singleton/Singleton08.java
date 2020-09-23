package com.wang.singleton;

/**
 * @author 王建起
 * @create 2020-09-23 17:36
 * @Description: 枚举
 */

/**
 * (1)这里借助JDK1.5中添加的枚举来实现单例模式。不仅能够避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 *
 * (2)这种方式是Effective Java作者Josh Bloch提倡的方式
 *
 * (3)结论：推荐使用
 *
 */
public class Singleton08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOK();
    }


}

enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok....");
    }
}
