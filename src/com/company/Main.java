package com.company;
/*
*       继承：多个类有共同得成员变量和成员方法有共同得行为和属性，我们抽取到另外得一个类中
*       extends;就是继承类
* */
public class Main {

    public static void main(String[] args) {
        dota d=new dota();
        d.start();
        lol l=new lol();



    }
    static  class  game{
        String name;
        double version;
        String agent;
        public void start(){
            System.out.println("begin");
        }
        public void end(){
            System.out.println("end");
        }
    }
    static  class  dota extends  game{
         /*String name;
         double version;
         String agent;
         public void start(){
             System.out.println("begin");
         }
         public void end(){
             System.out.println("end");
         }*/
    }
   static class lol{
       /* String name;
        double version;
        String agent;
        public void start(){
            System.out.println("begin");
        }
        public void end(){
            System.out.println("end");
        }*/

    }

}
