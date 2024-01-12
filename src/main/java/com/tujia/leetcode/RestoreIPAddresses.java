package com.tujia.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * @Author:lidongw_1
 * @Date 2020/6/9
 * @Description: 复原IP地址
 **/
public class RestoreIPAddresses {

    static List<String> result = new ArrayList();

    public static void main(String[] args) {

        String str = "25525511135";

        // String str = "010010";


       // dd("", str, 1);

        dd2("",0,str,1);
        for (Object s : result) {
            // if (s.split("\\.").length == 4 && s.replace(".","").length() == str.length()){
            System.out.println(s);
            //  }
        }
    }

    private static void dd(String per, String str, int leve) {
        for (int i = 1; i <= 3; i++) {
            if (i > str.length()) {
               return;
            }
            String substring = str.substring(0, i);

            if (i > 1){
                if (substring.startsWith("0") || substring.startsWith("00") ) {
                    continue;
                }
            }

            if (Integer.valueOf(substring) > 255) {
                continue;
            }
            if (leve < 4) {
                String sPer = per + substring + ".";
                dd(sPer, str.substring(i), leve + 1);
            }

            if (leve == 4 && i == str.length()) {
                result.add(per + str);
            }
        }
    }


    private static void dd2(String per, int start, String source, int leve) {
        for (int i = 1; i <= 3; i++) {
            if (start + i > source.length()) {
                return;
            }
            String substring = source.substring(start, start + i);

            if (i > 1){
                if (substring.startsWith("0") || substring.startsWith("00") ) {
                    continue;
                }
            }

            if (Integer.valueOf(substring) > 255) {
                continue;
            }
            if (leve < 4) {
                String sPer = per + substring + ".";
                dd2(sPer, start + i,source, leve + 1);
            }

            if (leve == 4 && i == (source.length() - start)) {
                result.add(per + source.substring(start));
            }
        }
    }
}
