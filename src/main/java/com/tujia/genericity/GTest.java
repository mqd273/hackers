package com.tujia.genericity;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by lidongw_1 on 2019/12/16.
 */
public class GTest {

    public static void main(String[] args) {


        Class<? extends ArrayList> aClass = new ArrayList<String>().getClass();

        Class<? extends ArrayList> aClass1 = new ArrayList<Integer>().getClass();

        System.out.println(aClass == aClass1);

        System.out.println(aClass.getTypeParameters());


        Type genericSuperclass = ObjListDate.class.getGenericSuperclass();

       // ((ParameterizedTypeImpl)genericSuperclass).getRawType().getName().equals(ListDate.class.getTypeName())

       // ((ParameterizedTypeImpl) genericSuperclass).getActualTypeArguments()[0]

        if (ObjListDate.class.getSuperclass().equals(ListDate.class)) {


        }

    }
}
/*
class Obj{

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}*/
