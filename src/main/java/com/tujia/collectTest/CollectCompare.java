package com.tujia.collectTest;


import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.compress.utils.Lists;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author:lidongw_1
 * @Date 2020/2/21
 * @Description: TODO
 * @deprecated
 **/
public class CollectCompare {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        ArrayList<A> a1 = Lists.newArrayList();
        a1.add(new A(1));
        a1.add(new A(2));
        ArrayList<A> a2 = Lists.newArrayList();
        a2.add(new A(3));
        a2.add(new A(2));

        CollectionUtils.subtract(a1,a2);


        List<Integer> list = Lists.newArrayList();
        list.add(2);
        System.out.println("list hash code : " + list.hashCode());
        System.out.println("size:" + list.size());
        inputInNUll(list);

        System.out.println(list.size());

        final  Integer i = 1;

        System.out.println(i.hashCode());
        intAdd(i);


        System.out.println(i.hashCode());
    }

    private static void intAdd(final Integer c) throws NoSuchFieldException, IllegalAccessException {
        Class<? extends Integer> aClass = c.getClass();

        Field value = c.getClass().getDeclaredField("value");

        value.setAccessible(true);
        value.set(c,5);

        System.out.println("c = "+ c +"  hash code : "+ c.hashCode());
    }


    private static void inputInNUll(Collection c){
        System.out.println("c hash code :" + c.hashCode());

        c.add(3);
    }


    static class A{
        public A(int age) {
            this.age = age;
        }

        private int age ;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "A{" + "age=" + age + '}';
        }
    }
}
