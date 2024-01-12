package com.tujia;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) throws IOException {

        TestLoad tl = TestLoad.testLoad;
        System.out.println(tl.context1);
        System.out.println(tl.context2);
    }

    private static void md5Test(String fileContent, int i, int num) {
        String[] md5s = new String[num + 1];
        long start = System.currentTimeMillis();
        while (i++ < num) {
            fileContent = fileContent + 1;
            String md5 = EncodeMD5Help.encodeByMD5(fileContent);
            System.out.println(md5);
        }
        long end = System.currentTimeMillis();
        System.out.println("encodeByMD5: 次数：" + num + " 耗时：" + (end - start) + " ms");
    }
}

class TestLoad {

    static TestLoad testLoad = new TestLoad(1);

    static int context1;
    static int context2 = 0;



    static {
        System.out.println("静态模块");
        ++context1;
        ++context2;
    }

   private TestLoad(){
       System.out.println("构造函数");
       context1++;
       context2++;
   }

    private TestLoad(int i){
        System.out.println("构造函数" + i);
        context1++;
        context2++;
    }

    public static TestLoad getSingson() {

        System.out.println("context1: " + context1);
        System.out.println("context2: " + context2);
        return testLoad;

    }

}
