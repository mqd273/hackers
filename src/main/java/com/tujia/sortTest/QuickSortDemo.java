package com.tujia.sortTest;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author:lidongw_1
 * @Date 2022/4/6
 * @Description: TODO
 **/
public class QuickSortDemo {

    public static void main(String[] args) {

        String s = new String("123");
        Integer[] arr = {3,5,9,6,20,50};
        sort(0,arr.length-1,arr);
        System.out.println(StringUtils.join(arr,","));

    }

    private  static void sort(int start , int end, Integer[] list){
        if (start >= end)
            return;

        int left = start;
        int right = end;
        // 优化点 相加取平均值
        int num = list[start];
        while (left < right){
            while (left < right && list[left] < num){
                left++;
            }

            while (right > left && list[right] > num){
                right--;
            }

            //交换 left join 交换值  也可以不用临时变量交换
            if (left < right){
                int tem = list[left];
                list[left] = list[right];
                list[right] = tem;
            }
        }
        //左边
        sort(0,left -1,list);
        //右边
        sort(right,end,list);
    }
 }
