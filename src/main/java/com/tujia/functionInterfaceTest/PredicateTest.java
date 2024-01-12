package com.tujia.functionInterfaceTest;

import java.util.function.Predicate;

/**
 * @Author:lidongw_1
 * @Date 2020/2/13
 * @Description: TODO
 **/
public class PredicateTest {


    public static void main(String[] args) {

        call("abc",f-> f.equals("abc"));

    }

    private static String call(Object obj ,Predicate predicate){


        if (predicate.test(obj)){

            return "true";
        }

        return  "false";
    }

}
