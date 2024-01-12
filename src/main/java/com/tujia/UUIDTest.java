package com.tujia;

import java.util.UUID;

/**
 * Created by lidongw_1 on 2019/7/5.
 */
public class UUIDTest {

    public static void main(String[] args) {

        try {

            UUID uuid = UUID.randomUUID();
            System.out.println(uuid.toString().replace("-",""));
            UUID aadd = UUID.fromString("aadd");
            System.out.printf(aadd.toString());
        } catch (IllegalArgumentException ex) {
            System.out.printf(ex.toString());
        }
    }
}
