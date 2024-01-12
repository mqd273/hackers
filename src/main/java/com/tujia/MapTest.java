package com.tujia;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lidongw_1 on 2018/8/9.
 */
public class MapTest {

    static  a1 aa;
    {
        aa = new a1();
    }


    public static void main(String... arg){

        Map<String, String> paramMap = new LinkedHashMap();
        String s = paramMap.get("a");
        aa = new a1();
        aa.setAge(5);

        System.out.println(aa.getAge());

        System.out.println(((a)aa).getAge());



    }


  static   void test(){
        a1 aa = new a1();
    }


    static  class  a{

        int age ;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


    static class  a1 extends  a{
        a1(){
            super();
            setAge(5);
        }
    }
}
