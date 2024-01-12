package com.tujia;

import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by lidongw_1 on 2018/8/12.
 */
public class StringTest {

    public static void main(String... arg) throws NoSuchFieldException, IllegalAccessException, MalformedURLException {


        String numberString = "12345";
        Integer i = 12345;

        boolean equals = numberString.equals(i.toString());

        System.out.println("String equals integer :" + equals);

        String str = "wlod shui&di";
        System.out.println("输出结果：" + str.substring(str.indexOf("shui")).replace("&", ""));

        String errorKey = String.format("Http_%s_bad_request", "actionName");
        System.out.println();

        System.out.println(errorKey);

        String url = "http://ctripgroupgateway-uat.ctripqa.com/aichat/ctripzhuge/getBIMultiLayerFAQ";

        URL urlObj = new URL(url);
        System.out.println(urlObj.getPath().lastIndexOf("/"));
        System.out.println(urlObj.getPath().substring(urlObj.getPath().lastIndexOf("/")));


        int a = 1;
        if (a == 1) {

            for (int j = 1; j < 3; j++) {
                break;
            }
        } else if (a == 1) {

        }


        System.out.println(1 + 1 + "");


        String subs = "abcdefg";

        System.out.println("substring 0-2 : " + subs.substring(0, 2));
        System.out.println("subs: " + subs);


        String sa = "abc";
        String an = new String("abc");

        System.out.println("a hashCode :" + sa.hashCode());
        System.out.println("an hashCode :" + an.hashCode());


        System.out.println("修改前");
        System.out.println("a value:" + a);
        System.out.println("an value:" + an);

        Field f = String.class.getDeclaredField("value");

        System.out.print("accessible : " + f.isAccessible());
        f.setAccessible(true);
        System.out.println(" -> " + f.isAccessible());
        char[] v = (char[]) f.get(a);
        System.out.print("a value : ");
        System.out.println(v);
        v[0] = 'z';

        System.out.println("a :" + a);
        System.out.println("an :" + an);
        //abc();
    }

    private static void abc() {
        List<String> aa = Lists.newArrayList("1", "2", "3", "4");

        String word = " ni hao : {} ,{} zai nali ,wo meng xiang ni {} ";

        for (String item : aa) {
            System.out.println(word);
            word = word.replaceFirst("\\{}", item);
        }

        // word.replaceFirst("\\{}","2");

        System.out.println(word);


        String dd = "";
        StringBuffer sb = new StringBuffer();
        sb.append(",");
        sb.append("1");

        if (sb.toString().length() > 1) {
            dd = sb.toString().replaceFirst(",", "");
        }

        String format = String.format("标签：%s 下关联有文章【%s】，请删除解除关联关系", 1L, dd);

        System.out.println(format);
    }


}
