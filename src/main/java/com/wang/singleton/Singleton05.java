package com.wang.singleton;

/**
 * @author 王建起
 * @create 2020-09-23 16:55
 * @Description: 懒汉式(同步代码块保证线程安全)
 * (1)这种方式，本意是想对上述（同步方法）实现方式的改进，因为前面同步方法效率太低了，改为同步产生实例化的代码块
 *
 * 　(2)但是这种同步并不能起到线程同步的作用。假如一个线程进入了if(instance==null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 *
 * 　　(3)结论：实际开发中，不能使用这种方式
 */
public class Singleton05 {
    private static Singleton05 instance;

    private Singleton05() {
    }

    public static Singleton05 getInstance(){
        if (instance == null){
            synchronized (Singleton05.class){
                instance =new Singleton05();
            }
        }
        return  instance;
    }


}
