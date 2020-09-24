package com.company;

public class extend12 {
    public static void main(String[] args) {
        basic b=new basic();
        b.name="ljj";
        b.teach();
        job j=new job();
        j.name="jjl";
        j.teach();

    }
}
abstract class teacher{
    String name;
    String age;
    String sex;

    public abstract void teach() ;
}
class basic extends teacher{

    @Override
    public void teach() {
        System.out.println(name+"将基础班课程");
    }
}
class job extends  teacher
{

    @Override
    public void teach() {
        System.out.println(name+"就业办老师");
    }
}