package com.tujia.turnDown;

//import com.tujia.turnDown.TurnDownImpl.InnerClass;


import org.apache.commons.lang3.NotImplementedException;

/**
 * @Author:lidongw_1
 * @Date 2020/2/10
 * @Description: TODO
 **/
public class TurnDownImpl //implements ITurnDown
 {
     public static int f(int num){

            try{
                int i =3;
                return  num * num;
            }finally {
                if (num == 2){
                    return 0;
                }
            }

     }

    public static void main(String[] args) {
     /*   TurnDownImpl turnDown = new TurnDownImpl();
        turnDown.a = "bbbb";
        ITurnDown iTurnDown = turnDown;
        TurnDownImpl ipml = (TurnDownImpl) iTurnDown;

        InnerClass innerClass = new InnerClass();

        iTurnDown.ss();
        System.out.println("args = " + ipml.a +"    "+ iTurnDown.hashCode() +"  "+ ipml.hashCode());*//**/

       /* while (true) {
            int[] ints = new int[100000];
        }*/

        System.out.println(InnerClass.f(2));

    }


  //  public String a="aaa";

    static class InnerClass{
        public static int f(int num){

           /* try{
                return  num * num;
            }finally {
                if (num == 2){
                    return 0;
                }
            }*/
           throw new NotImplementedException("");
        }
    }
}
