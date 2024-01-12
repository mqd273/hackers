package com.tujia.jsonTest;

import lombok.Data;

import javax.crypto.interfaces.PBEKey;

/**
 * @Author:lidongw_1
 * @Date 2020/7/8
 * @Description: TODO
 **/
@Data
public class InnerClassJson {

    private String name;

    private InnerClass innerClass;

    @Data
    public static class InnerClass{

        public String dd;

        public int age;
    }
}
