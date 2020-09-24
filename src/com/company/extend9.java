package com.company;
/*
*       抽象类 abstract用于修饰方法和类
*       抽象方法：不同类的方法是相似的但是具体的方法是不太一样的，只抽取他的声明
*       抽象类不能船舰对象（不能实例化）
* */
public class extend9 {
    public static void main(String[] args) {
        dog d=new dog();
        d.barking();
        d.run();
    }
}
abstract class aninmal{
    String  name="来福";
    final  int num=10;
    public  aninmal(){
        System.out.println("chouxiang");
    }
    public abstract void eat();
    public  void run(){
        System.out.println("---");
    }
}

class dog extends aninmal {
    public void barking() {
        System.out.println(name+"---"+num);
    }
    @Override
    public void eat() {

    }
}