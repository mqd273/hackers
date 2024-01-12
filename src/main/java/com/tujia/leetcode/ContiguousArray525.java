package com.tujia.leetcode;

/**
 * @Author:lidongw_1
 * @Date 2021/6/3
 * @Description: 0、1 的最长子集
 **/
public class ContiguousArray525 {


    public static void main(String[] args) {
        int[] nums =new int[]{0,1,0,1,1,1,1,0,1};
        System.out.println(findMaxLength(nums));
        //  String string = new String("dd");

    }

    public static int findMaxLength(int[] nums) {

        int first_0 = 0;
        int first_1 = 0;

        int temp_first_0 = 0;
        int temp_first_1 = 0;

        for (int i = 0; i < nums.length; ) {

            if (i+1 >= nums.length) {
                break;
            }

            if (nums[i] == 0 && nums[i+1] == 1){
                temp_first_0 ++;
                if (temp_first_1 > first_1) {
                    first_1 = temp_first_1;
                }
                temp_first_1 = 0;
                i+=2;
                continue;
            }


            if (nums[i] == 1 && nums[i+1] == 0){
                temp_first_1 ++;
                if (temp_first_0 > first_0) {
                    first_0 = temp_first_0;
                }
                temp_first_0 = 0;
                i+=2;
                continue;
            }


            first_0 = Math.max(first_0,temp_first_0);
            first_1 = Math.max(first_1,temp_first_1);

            temp_first_0 = 0;
            temp_first_1 = 0;

            i++;
        }

        first_0 = Math.max(first_0,temp_first_0);
        first_1 = Math.max(first_1,temp_first_1);
        return Math.max(first_0,first_1) *2;
    }
}
