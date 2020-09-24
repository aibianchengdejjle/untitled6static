package com.company;
/*
*   java继承中得特点 只支持单一继承，只能继承一个父类
*   简单来说一个儿子只能由一个亲爹。
*   但是java语言支持得是多层继承
* */
public class jicheng {
    public static void main(String[] args) {
        lol l=new lol();
        l.update();
        l.start();  //这是他爷爷得功能
    }

}
class game
{
    public  void start(){
        System.out.println("game启动");
    }
}
class pc extends  game{
    public  void update(){
        System.out.println("pc更新");
    }

}

class phone extends  game{

}
class lol extends pc{

}

