package com.test.root.pattern.singleton;

/**
 * Created by Administrator on 2019/1/10.
 */
public class Singleton {
    //创建一个singleton对象
    private static Singleton init;
    //私有化构造器，保证不被别实例化
    private Singleton(){
        System.out.println("我是私有构造");
    }
    //获取唯一可用对象
    public static Singleton getInit(){
        System.out.println(init);
        if(init == null){
            init = new Singleton();
        }
        System.out.println(init);
        return init;
    }

    public String hello(){
       return "hello world";
    }
}


class test{
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Singleton singleton = Singleton.getInit();
        System.out.println(singleton.hello());
        System.out.println(System.currentTimeMillis()-time);

    }
}