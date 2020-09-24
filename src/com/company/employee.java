package com.company;

public class employee {
    public static void main(String[] args) {
        program p=new program();
        p.name="jjl";
        p.work();
        manger m=new manger();
        m.bouns="1";
        m.work();
    }
}
abstract class E{
    String name;
    String id;
    String pay;
    //工作
    public abstract void work();
}
class program extends  E{

    @Override
    public void work() {
        System.out.println("写代码");
    }
}
class manger extends  E{
    String bouns;


    @Override
    public void work() {
        System.out.println(bouns+"管理项目");
    }
}
