package com.tujia;

import java.io.*;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by lidongw_1 on 2018/6/29.
 */
public class MD5Test {


    public static void main(String... arg) throws IOException {

        String encode = URLEncoder.encode("https://pwa.fvt.tujia.com/h5/bnbhybrid/rnjumppage?tv=8.223_8.224&qv=60001329_80011216&navbar=1&hasHysdk=1&rnurl=tujia%253A%252F%252Fcrn%253Fpage%253DOrderFormPage%2526module%253Drn_booking%2526activityInfo%253D%257B%2522benefitId%2522%253A53984%252C%2522landlordSourceChannelCode%2522%253A%2522czyj2004%2522%252C%2522version%2522%253A1%257D", "UTF-8");
        String decode = URLDecoder.decode("https://pwa.fvt.tujia.com/h5/bnbhybrid/rnjumppage?tv=8.223_8.224&qv=60001329_80011216&navbar=1&hasHysdk=1&rnurl=tujia%253A%252F%252Fcrn%253Fpage%253DOrderFormPage%2526module%253Drn_booking%2526activityInfo%253D%257B%2522benefitId%2522%253A53984%252C%2522landlordSourceChannelCode%2522%253A%2522czyj2004%2522%252C%2522version%2522%253A1%257D", "UTF-8");

        do{
            decode = URLDecoder.decode(decode, "UTF-8");
        }while (decode.contains("%25") || decode.contains("%26"));

        System.out.println(decode);

        ObjA objA = new ObjA();
        objA.setAge(12);
        objA.setName("nihao");


        ObjA objB = new ObjA();
        objA.setAge(123);
        objA.setName("nihaoB");

        InputStream objA1 = ClassLoader.getSystemResourceAsStream("objA");

        int read = objA1.read();


        //ObjectInputStream objectInputStream = new ObjectInputStream(objA);


        URL resource = MD5Test.class.getClassLoader().getResource("a.txt");

        FileInputStream fin = new FileInputStream(resource.getPath());
        byte[] bytes = new byte[fin.read()];
        fin.read(bytes);
        fin.close();
        String s = new String(bytes);
        String s2 = new String(bytes);


        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            if (i == 0) {
                if (s.equals(s2)) {
                    System.out.println("原样比较一致");
                }
            }

            if (s.equals(s2)) {
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("字符串比较 10000 次 用时：" + (end - begin));

        String md51 = EncodeMD5Help.encodeByMD5(s);
        String md52 = EncodeMD5Help.encodeByMD5(s2);

        long begin1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            if (i == 0) {
                if (md51.equals(md52)) {
                    System.out.println("MD5比较一致");
                }
            }
        }
        long end1 = System.currentTimeMillis();
        System.out.println("字符串 MD5 比较 10000 次 用时：" + (end1 - begin1));

    }



    static class ObjA{

        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


}
