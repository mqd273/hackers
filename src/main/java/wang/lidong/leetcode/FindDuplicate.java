package wang.lidong.leetcode;

/**
 * @Author:lidongw_1
 * @Date 2020/5/26
 * @Description: 一个数组中重复的数
 **/
public class FindDuplicate {

    public static void main(String[] args) {

        int[] nums = {1,3,4,6,9,10,6};

        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = nums.length - 1; i1 > i; i1--) {
                if (nums[i] == nums[i1])
                    return nums[i];
            }
        }
        return 0;
    }


    public static int findDuplicate_1(int[] nums) {

        long count = 0;
        long count_n = 0;
        for (int i = 1; i <= nums.length; i++) {
          count += nums[i-1];
          count_n +=i;

        }

        long trueAvg = count/nums.length;
        long avg = count_n /nums.length;

        if (trueAvg == avg) {
            return (int) (count_n /nums.length);
        }

        if (trueAvg > avg) {
            for (int i = 0; i <= nums.length; i++) {
                if (nums[i] < avg){
                    continue;
                }
                for (int i1 = i+1; i1 < nums.length; i1++) {
                    if (nums[i] == nums[i1])
                        return  nums[i];
                }
            }
        }else{
            for (int i = 0; i <= nums.length; i++) {
                if (nums[i] > avg){
                    continue;
                }
                for (int i1 = i+1; i1 < nums.length; i1++) {
                    if (nums[i] == nums[i1])
                        return  nums[i];
                }
            }
        }


        return 0;
    }

}
