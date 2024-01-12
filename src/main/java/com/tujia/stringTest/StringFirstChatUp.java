package com.tujia.stringTest;

/**
 * @Author:lidongw_1
 * @Date 2020/2/26
 * @Description: TODO
 **/
public class StringFirstChatUp {

    public static void main(String[] args) {



        String s2 = "1";

        String s1 = new String("1");


        if (s2 ==s1) {
            System.out.println( "1" +" = " + "new String(\"1\")");
        }



        String a = "AaaaaBbbbb";
        // a.toLowerCase()
        String nickName = "18dd1dddddd";


        String s = nickName.replaceAll("\\d{4}(\\d{3})", "****$1");

        System.out.println(s);

        String userId = "ctripbnb#ddd#123";

        System.out.println(userId.indexOf("#"));
        System.out.println(userId.hashCode());
        System.out.println(userId.concat("abc"));
        System.out.println(userId.hashCode());
        System.out.println(userId);

        System.out.println(userId.substring(0, userId.indexOf("#")));
        System.out.println(userId.substring(userId.indexOf("#") + 1));

        StringBuffer sb = new StringBuffer(10);


    }


}
