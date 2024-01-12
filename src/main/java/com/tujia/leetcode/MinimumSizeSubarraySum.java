package com.tujia.leetcode;

/**
 * @Author:lidongw_1
 * @Date 2020/6/28
 * @Description: 长度最小的子数组 209
 **/
public class MinimumSizeSubarraySum {

    public static void main(String[] args) {

        MinimumSizeSubarraySum subarraySum = new MinimumSizeSubarraySum();
        int s = 7,n=0;  int[] nums =new int[]{2,3,1,2,4,3};

        System.out.println(n + ":" + nums[++n] + " :" + n);

        System.out.println(n += ++n);

        int i = subarraySum.minSubArrayLen(s,nums);
        System.out.println(i);
    }

    public int minSubArrayLen(int s, int[] nums) {

        if (nums.length == 0)
            return 0;

        int minSubLen = nums.length +1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= s) {
                return  1;
            }

            int n = i +1;
            int sum = nums[i];
            while (n < nums.length ){
                sum += nums[n];
                if(sum >= s){
                    minSubLen = Math.min(minSubLen,n- i +1);
                    break;
                }
                n++;
            }
           // minSubLen = getMinSubLen(nums, minSubLen, i, n);

        }

        return minSubLen == nums.length ? 0 : minSubLen;
    }

    private int getMinSubLen(int[] nums, int minSubLen, int i, int n) {

        if (minSubLen > (n - i) || minSubLen == 0){
            minSubLen = n - i + 1 ;

            int m = i;
            for(;m<n ; m++){
                System.out.print(nums[m]+",");
            }

            System.out.println();
        }
        return minSubLen;
    }


    int v2(int s, int[] nums){

        int minSubLen = 0;
        int i = 0;
        while (i < nums.length){

            int n = i+1;
            if (n >= nums.length)
                return  minSubLen;

            if (nums[n] >= s) {
                return  1;
            }

            int sum = nums[i];
            while (n < nums.length && (sum + nums[n]) < s){
                sum += nums[n];
                n++;
            }

            minSubLen = getMinSubLen(nums, minSubLen, i, n);

            i = n;
        }

        return minSubLen;

    }

}
