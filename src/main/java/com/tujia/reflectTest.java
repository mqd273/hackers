package com.tujia;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.google.common.collect.Lists;
import com.sun.istack.NotNull;
import org.eclipse.jetty.util.ajax.JSON;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by lidongw_1 on 2018/11/8.
 */
public class reflectTest {


    public static void main(String[] args) throws IllegalAccessException, InterruptedException {

        reflectTest r =new reflectTest();

        A a= new A();
        a.setAge(1);
        a.setName("hello");
        a.setUnitIds(Lists.newArrayList(1L,2L,3L));


        TTest<A> ttTest = new TTest<A>();

        ttTest.setData(a);
        TMonth(ttTest);

        Field[] declaredFields = a.getClass().getDeclaredFields();


        for (Field field : declaredFields) {
            field.setAccessible(true);

            Object obj = field.get(a);

            Annotation[] annotations = field.getAnnotations();

            if (field.isAnnotationPresent(EsFilter.class)) {
                EsFilter annotation = field.getAnnotation(EsFilter.class);
                System.out.println(annotation.value());
            }

            for (Annotation annotation : annotations) {
                Class<? extends Annotation> aClass = annotation.annotationType();

                Field[] fields = aClass.getFields();

                System.out.println("sss");

            }

            System.out.println(obj);

            if (field.getType().equals(String.class)){

                field.set(a,"123456");
            }

            System.out.println(a.getName());
        }
    }

    public static void TMonth(TTest t) throws InterruptedException, IllegalAccessException {

        Object data = t.getData();
        if (data== null)
        {
            System.out.println("对象是null");
            return;
        }
        Field[] declaredFields = t.getData().getClass().getDeclaredFields();

        for (Field field : declaredFields) {

            field.setAccessible(true);
            if (field.isAnnotationPresent(EsFilter.class)) {
                EsFilter annotation = field.getAnnotation(EsFilter.class);
                System.out.println(annotation.value());

                Object o = field.get(t.getData());
                if (o.getClass().equals(List.class)){
                    System.out.println("list 类型解析 ：" + annotation.value() +" :" + JSON.toString(o));
                }else{
                    System.out.println("通用解析 ： " + annotation.value() + ":" + o);
                }
            }
        }
        Thread.currentThread().sleep(10000L);

        System.out.println("停了10000ms");
    }


    public static class A{


        @NotNull()
        @JsonFilter("NAME")
        private String name;

        @EsFilter("AGE")
        private int age;

        @EsFilter("UNITIDS")
        private List<Long> unitIds;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public List<Long> getUnitIds() {
            return unitIds;
        }

        public void setUnitIds(List<Long> unitIds) {
            this.unitIds = unitIds;
        }
    }
    @Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @JacksonAnnotation
    public @interface  EsFilter{
        String value();
    }


    public static class TTest<T>{

        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
