package com.tujia.format;

import java.text.Normalizer;
import java.util.Formatter;

/**
 * @Author:lidongw_1
 * @Date 2020/4/1
 * @Description: TODO
 **/
public class FormatterTest {

    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        f.format("%15s  %-20s","aaa","bbb");
        System.out.printf("%s %d %f  ","你好",10,5.6f);
        System.out.printf("%s %d %f","你好",10,5.6f);
    }
}
