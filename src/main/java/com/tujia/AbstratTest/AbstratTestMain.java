package com.tujia.AbstratTest;

/**
 * Created by lidongw_1 on 2018/8/21.
 */
public class AbstratTestMain {

    public static void main(String... arg){

        A a1 = new A1();
        a1.printName();
        a1.showName();
    }
}


abstract class  A{
    public String name ="";
    public void printName(){
        System.out.println(name);

        System.out.println(getName());
    }

    public String getName(){
        System.out.println("父类："+ name);
        return name;
    };

    public void showName(){
        System.out.println("showName:" + getName());
    }
}

class A1 extends A{

    public String name ="aaaa";

    @Override
    public String getName() {
       //super.getName();
        return name ;
    }
}
