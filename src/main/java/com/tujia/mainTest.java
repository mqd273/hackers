package com.tujia;

/**
 * Created by lidongw_1 on 2019/1/30.
 */
public class mainTest {

    public static void main(String[] args) {

        dd d = new dd();

        Thread thread = new Thread(()->{
            d.a();
        });

        Thread thread1 = new Thread(()->{
            d.b();
        });

        thread.start();
        thread1.start();

      /*  byte[] bytes = new byte[3];
        bytes[0] = 1;
        bytes[1] = 0;
        bytes[2] = 1;

       // Arrays.fill(bytes,1,2, (byte) 1);

        String v = "0";
        for (int i = 0; i < bytes.length; i++) {
            v = bytes[i] + v;
        }

        System.out.println(new String(bytes) + " aa:" + bytes.length);

        System.out.println(v);

        System.out.println(v.getBytes());




        int a;
        int b = 3;

        while ((a = b) >= 0) {
            System.out.println("args = [" + a + "]");

            System.out.println("args = [" + (a = b) + "]");

            a = -1;
            b = -1;
        }


        int i = -1;
        int j = i >>> 1;
        int m = i >> 1;

        System.out.println(j);
        System.out.println(m);

        System.out.println(i ^ j);

        System.out.println(0 ^ 1);

        Hashtable hd = new Hashtable(10);*/
    }

     static class dd{

        public  synchronized  void a()  {
            System.out.println(Thread.currentThread().getName() + ": a");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b();
        }

        public synchronized  void b() {
            System.out.println(Thread.currentThread().getName() + " : b");
            a();
        }
    }
}
