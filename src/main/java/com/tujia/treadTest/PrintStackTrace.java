package com.tujia.treadTest;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by lidongw_1 on 2018/9/21.
 */
public class PrintStackTrace {


    public static void main(String[] args) {
        cl c = new cl();
        c.a();
        System.out.println();
        DateTime dt = new DateTime("2018-10-07");
        System.out.println(dt.getDayOfWeek());
        DateTime now = DateTime.now();
        System.out.println(now.getDayOfWeek());

        StringEntity stringEntity = new StringEntity("", ContentType.APPLICATION_JSON);


    }

    static class cl {
        private void a() {
            b();
        }

        private void b() {
            c();
        }

        private void c() {


            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            System.out.println(stackTrace.length + " " + stackTrace[2].getMethodName() + " " + stackTrace[2].toString());
        }
    }

}
