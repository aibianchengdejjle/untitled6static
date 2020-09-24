package com.company;
/*
*   方法的重写  子类的方法和父类的方法一样，子类重写了父类的方法
* */
public class extend4 {
    public static void main(String[] args) {
      Kid k=new Kid();
      k.eat();

    }
}
class Dad {
    public  void eat(){
        System.out.println("喝酒");
        System.out.println("睡觉");
    }
}

class Kid extends Dad{
    public void eat(){
        System.out.println("haohaoxuexi");
    }
}