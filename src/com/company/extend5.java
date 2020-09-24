package com.company;
/*
*       方法的注意事项
*       注解 @  起一个提示作用
*       不能重写父类私有的方法
*       权限必须大于等于父类方法的权限
* */
public class extend5 {
    public static void main(String[] args) {
     smartphone s=new smartphone();
     s.call();
    }
}
class Phone{
    public  void call(){
        System.out.println("call");
    }
}
class smartphone extends Phone{
    @Override
    public void call(){
        System.out.println("录音");
        //super.call();
    }
}

