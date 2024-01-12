package com.tujia;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by lidongw_1 on 2018/6/25.
 */
public class ZipRedisTest {


 /*  // static Tedis tedis = getTedis();
    static ExecutorService executor = new ThreadPoolExecutor(200, 200, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

    public void doTest() throws IOException {
        URL url = App.class.getResource("/a.txt");
        System.out.println(url.getPath());
        // URL resource = App.class.getClassLoader().getResource("a.txt");



        // System.out.println(resource.getPath());
        File file = new File(url.getPath());
        String fileContent = FileUtils.readFileToString(file, "UTF-8");

        int i = 0;
        int num = 100000;

        // md5Test(fileContent, i, num);
        // tedis.set("A-111",fileContent);
        i = 0;

        int reptNum = 500000;
        long readRedisStart = System.currentTimeMillis();
        while (i++ < reptNum) {
            executor.submit(() -> {
             //   String s = tedis.get("A-111");
            });
        }
        long readRedisEnd = System.currentTimeMillis();
        System.out.println("读"+ reptNum +"次 redis 耗时:" + (readRedisStart - readRedisEnd) + " ms");

        //================压缩模式================
        byte[] contentBytes = ZipHelper.gzipCompress(fileContent, "UTF-8");


        //单独解压测试测试需要多长时间
        System.out.println("================= 单独压缩" + reptNum + " 次 开始==============" );
        long onlyCompressContentStart = System.currentTimeMillis();
        while (i++ < reptNum) {
            executor.submit(() -> {
                ZipHelper.gzipCompress(fileContent, "UTF-8");
            });
        }
        long onlyCompressContentEnd = System.currentTimeMillis();
        System.out.println("=============== 单独压缩" + reptNum + " 次耗时:" + (onlyCompressContentEnd - onlyCompressContentStart) + "ms" );

        System.out.println("=============== 单独压缩" + reptNum + " 次 结束 ================" );



        System.out.println("原数据byte 长度：" + fileContent.getBytes().length + "压缩后数据长度：" + contentBytes.length + " 压缩比例：" + (fileContent.getBytes().length / contentBytes.length));
        java.lang.String key = "ZIP-KEY";
        byte[] keyBytes = key.getBytes("UTF-8");
        //写
        //tedis.set(keyBytes,contentBytes);

     //   byte[] bytes = tedis.get(keyBytes);
      //  byte[] bytes1 = ZipHelper.gzipUncompress(bytes);
        String s = new String(bytes1, "UTF-8");
        String sourceMD5 = EncodeMD5Help.encodeByMD5(fileContent);
        String uncompressMD5 = EncodeMD5Help.encodeByMD5(s);
        //MD5比较解压结果
        if (sourceMD5.equals(uncompressMD5)) {
            System.out.println("解压后的数据相同");
        }

        //单独解压测试测试需要多长时间
        System.out.println("================= 单独解压缩" + reptNum + " 次 开始==============" );
        long onlyUncompressContentStart = System.currentTimeMillis();
        while (i++ < reptNum) {
            executor.submit(() -> {
                byte[] bytes3 = ZipHelper.gzipUncompress(bytes);
            });
        }
        while(!executor.isTerminated()){
            System.out.println("================= 单独解压缩" + reptNum + " 次 开始==============");
        }

        long onlyUncompressContentEnd = System.currentTimeMillis();
        System.out.println("=============== 单独解压缩" + reptNum + " 次耗时:" + (onlyUncompressContentEnd - onlyUncompressContentStart) + "ms" );

        System.out.println("=============== 单独解压缩" + reptNum + " 次 结束 ================" );

        //读解压
        long zReadRedisStart = System.currentTimeMillis();
        i = 0;
        while (i++ < reptNum) {
            executor.submit(() -> {
                byte[] bytes2 = tedis.get(keyBytes);
            });
            // byte[] bytes3 = ZipHelper.gzipUncompress(bytes);
            // String s1 = new String(bytes1, "UTF-8");
        }
        long zReadRedisEnd = System.currentTimeMillis();


        //读解压
        long zipReadStart = System.currentTimeMillis();
        i = 0;
        String s1;
        System.out.println("读并且解压缩开始 监控下CPU变化 =========================== ");
        while (i++ < reptNum) {
            executor.submit(() -> {
                byte[] bytes2 = tedis.get(keyBytes);
                byte[] bytes3 = ZipHelper.gzipUncompress(bytes);
                try {
                    new String(bytes1, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            });
        }
        long zipReadRedisEnd = System.currentTimeMillis();

        System.out.println("redis 读原始数据；" + reptNum + "次 耗时：" + (readRedisEnd - readRedisStart) + " ms");
        System.out.println("redis 读压缩数据：" + reptNum + "次 耗时：" + (zReadRedisEnd - zReadRedisStart) + " ms");
        System.out.println("redis 读并且解压数据：" + reptNum + "次 耗时：" + (zipReadRedisEnd - zipReadStart) + " ms");


    }

    private static Tedis getTedis() {
        //Tedis(String namespace, String password, int connTimeout, int soTimeout, int maxAttempts, int maxTotal, int maxIdle, int minIdle, String zkAddress) {
        Tedis tedis = new Tedis(
                "tns_product_new", "0xso28051mp", 3000, 3000, 3, 3000, 40, 8, "10.2.3.104:2181,10.2.3.105:2181,10.2.3.106:2181");
        return tedis;
    }*/

}
