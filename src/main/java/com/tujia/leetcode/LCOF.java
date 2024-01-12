package com.tujia.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author:lidongw_1
 * @Date 2020/6/3
 * @Description: 调整数组顺序使奇数位于偶数前面
 **/
public class LCOF {

    public static void main(String[] args) {

       // int[] nums =  {1,2,3,4};
       // int[] nums =  {2,4,6};
       // int[] nums =  {1,3,5};
        int[] nums =  {2,3,6,8,7,8};
        int j = nums.length -1;

        // i 是奇数
        for (int i = 0 ;i < nums.length ; i++) {
            if (i == j)
                break;
            if (nums[i]%2 == 0) {
                while (nums[j] % 2 == 0){
                    if (j == 0 || j == i){
                        break;
                    }
                    j--;
                }

                if (i==j)
                    break;

                nums[i] = nums[i]^nums[j];
                nums[j] = nums[i]^nums[j];
                nums[i] = nums[i]^nums[j];
            }
        }

        for (int num : nums) {
            System.out.print(num);
        }

    }
}
