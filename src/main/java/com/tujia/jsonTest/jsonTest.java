package com.tujia.jsonTest;

import com.tujia.App;

import java.net.URL;

/**
 * Created by lidongw_1 on 2018/11/8.
 */
public class jsonTest {

    public static void main(String[] args) throws Exception {


        InnerClassJson innerClassJson =new InnerClassJson();
        innerClassJson.setName("外层");

        InnerClassJson.InnerClass innerClass = new InnerClassJson.InnerClass();
        innerClass.setDd("哪儿吃");

        innerClassJson.setInnerClass(innerClass);


      /*  String s1 = JSONUtils.toJSONStringWriteNullListAsEmpty(innerClassJson);


        InnerClassJson innerClassJson1 = JSONUtils.fromString(s1, InnerClassJson.class);

*/


        URL url = App.class.getResource("/a.txt");


        A a = new A();
        a.setAge(1);
        a.setName("abc");
        a.setA1(new A());
     //   String s = JSONUtils.toJSONStringWriteNullListAsEmpty(a);

        long l = System.currentTimeMillis();
        for (int i =1; i < 1000000;i++) {
       /*     A a1 = JSONUtils.fromString(s, A.class);

            A a2 = JSONUtils.fromString(s, A.class);
*/
           // System.out.println("a1 hash code :" + a1.hashCode());
           // System.out.println("a2 hash code :" + a2.hashCode());

          //  System.out.println("a1.a1 hash code :" + a1.getA1().hashCode());
           // System.out.println("a2.a1 hash code :" + a2.getA1().hashCode());
        }

        System.out.println("1000000 :" +(System.currentTimeMillis() - l));




    }


}
