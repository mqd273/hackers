package com.tujia.interfaceTest;


import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lidongw_1 on 2018/12/4.
 */
@FunctionalInterface
public interface FunctionalInterfaceTest {

    void a();
    // int c(int a);


    default void b(){

        ArrayList<Object> objects = Lists.newArrayList();

        List<String> collect = objects.stream().map((m) -> m.toString()).collect(Collectors.toList());

    };


}
