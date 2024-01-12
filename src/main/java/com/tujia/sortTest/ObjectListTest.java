package com.tujia.sortTest;

import com.google.common.collect.Lists;
import com.tujia.ThisScopeTest;
import org.joda.time.DateTime;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Created by lidongw_1 on 2019/3/21.
 */
public class ObjectListTest {

    public static void main(String[] args) {


        List<A> aa = Lists.newArrayList(new A().setAge(3).setName("1").setDt(DateTime.now().toDate()), new A().setAge(2).setName("2").setDt(new Date(100000)));

        Collections.sort(aa, new Comparator<A>() {
            @Override
            public int compare(A o1, A o2) {
                return -o1.getDt().compareTo(o2.dt);
            }
        });
        aa.sort(Comparator.comparing(A::getAge).reversed());

        aa.forEach(p -> {
            System.out.println(p.getAge());
            System.out.println(p.getDt());
        });

    }

    static class A {

        int age;
        String name;
        Date dt;

        public int getAge() {
            return age;
        }

        public A setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public A setName(String name) {
            this.name = name;
            return this;
        }

        public Date getDt() {
            return dt;
        }

        public A setDt(Date dt) {
            this.dt = dt;
            return this;
        }
    }
}
