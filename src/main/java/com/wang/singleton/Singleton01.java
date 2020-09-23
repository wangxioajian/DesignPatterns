package com.wang.singleton;

/**
 * @author 王建起
 * @create 2020-09-23 15:46
 * 饿汉式，静态常量
 */

/**
 * (1)优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 *
 * (2)缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费
 */
public class Singleton01 {
    //本部内部创建的对象实例
    private  static final Singleton01 instance=new Singleton01();

    /**
     *构造器私有化，外部不能new
     */
    private Singleton01(){
    }

    /**
     * 提供一个公有静态方法吗，返回实例对象
     */
    private static Singleton01 getInstance(){
        return instance;

    }

    public static void main(String[] args) {
        //测试
        Singleton01 insane1=Singleton01.getInstance();
        Singleton01 insane2=Singleton01.getInstance();;
        Singleton01 singleton01=Singleton01.getInstance();
        System.out.println(insane1==insane2);
        System.out.println(insane1.hashCode());
        System.out.println(insane2.hashCode());
        System.out.println(singleton01.hashCode());

    }


}
