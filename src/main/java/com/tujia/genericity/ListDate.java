package com.tujia.genericity;

import java.lang.reflect.ParameterizedType;

/**
 * Created by lidongw_1 on 2019/12/16.
 */
public class ListDate<T> {

    public Object getType(){

        Class<T> tClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return tClass;

    }


}
