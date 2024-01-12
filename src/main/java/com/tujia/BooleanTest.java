package com.tujia;

import java.io.File;
import java.io.IOException;

/**
 * Created by lidongw_1 on 2018/9/5.
 */
public class BooleanTest {

    public static void main(String[] args) {

        try {
            Boolean b1 = new Boolean(true);

            System.out.println(b1 == false);
            System.out.println("b1 = " + b1);

            File file = new File("dd");
            file.exists();

        } catch (OutOfMemoryError | RuntimeException e) {

        }


    }
}
