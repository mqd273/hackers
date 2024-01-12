package com.tujia.heapTest;


import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class HeapOutside {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, UnsupportedEncodingException {

        String from = "wanglidong9  <wanglidong9@163.com>";
        System.out.println(from.substring(from.indexOf('<')+1,from.indexOf('>')));

        String str = "nihao,你好";
        String gbk = new String(str.getBytes(StandardCharsets.UTF_8), "GBK");
        System.out.println(gbk);

        String gbk1 = new String(gbk.getBytes("GBK"), StandardCharsets.UTF_8);
        System.out.println(gbk1);

        String s = new String(str.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        System.out.println(s);

        String s1 = new String(str.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
        System.out.println(s1);


        String s2 = "ffffffffff222��ã�����һ�������ʼ�";

        String gbk2 = new String(s2.getBytes(), "UTF-8");
        System.out.println(gbk2);

        String s3 = new String(gbk2.getBytes("GBK"), "UTF-8");
        System.out.println(s3);

        String s7 = Base64.getEncoder().encodeToString(gbk2.getBytes(StandardCharsets.UTF_8));
        System.out.println(s7);
        byte[] decode2 = Base64.getDecoder().decode(s7);
        System.out.println(new String(decode2, "gbk"));


        // byte[] encode = Base64.getMimeEncoder().encode(s2.getBytes());
        //byte[] decode = Base64.getDecoder().decode(encode);
        //String gbk3 = new String(decode, "GBK");
        //System.out.println(gbk3);


        String s4 = "bmloYW8gIMTjusMgo6GjoQ==";
        byte[] decode1 = Base64.getDecoder().decode(s4);
        String gbk4 = new String(decode1, "GBK");
        System.out.println(gbk4);

        String gbk5 = new String(gbk4.getBytes(StandardCharsets.UTF_8), "GBK");
        System.out.println(gbk5);

        byte[] encode = Base64.getEncoder().encode(gbk4.getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(encode));

        String s5 = org.apache.commons.codec.binary.Base64.encodeBase64String(gbk4.getBytes(StandardCharsets.UTF_8));
        System.out.println(s5);

        byte[] decode = Base64.getDecoder().decode(new String(encode));
        String gbk3 = new String(decode, "GBK");
        System.out.println(gbk3);


        String s6 = "T/pp0DCxEh5IQ3Pyoo6fuRysoXZEyYc6RDA/0PsaPGo=";
        byte[] encode1 = Base64.getDecoder().decode(s6);
        System.out.println(new String(encode1,"utf-8"));



    }
}
