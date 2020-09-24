package com.company;
/*
*       如果你在子类的方法中没有对父类的方法尽心调用，那么默认调用的是父类的无参构造方法
*       如果你在子类中调用了父类的构造方法那么就要在子类的第一行中用super进行调用
*       肯定会执行父类构造不管是不是有参还是无参构造
* */
public class extend6 {
    public static void main(String[] args) {
       // die d=new die();
        er e=new er();

    }
}
class die{
    public  die(){
        System.out.println("父类无参构造");
    }

    public  die(int num){
        System.out.println("父类有参构造");
    }
}
class er extends  die{

    public  er(){
        this(1);
        System.out.println("子类无参构造");
    }
    public  er(int sum){
        System.out.println("子类有参构造");
    }
}
