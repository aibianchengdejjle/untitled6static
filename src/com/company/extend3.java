package com.company;
/*
*       子类只能继承父类的非私有的（private）
*       如果子类和父类的名字是一样的就直接用子类的 就近原则
*       super 可以获取父类的成员变量和成员方法
*       用法和this是一样的
*       this是用来搞此类的对象
* */
public class extend3 {
    public static void main(String[] args) {
        kid k=new kid();
        k.show();
    }
}
class dad{
    String name="1";
}
class  kid extends dad{
    String name="2";
    public  void show(){
        String name="3";
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);

    }
}
