package com.cgj.leet.code.explore.april.week1_3maxSumSubArray;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
class Solution {
    public int maxSubArray(int[] nums) {
        //初始化最大和为a【0】
        int maxsum, maxhere;
        maxsum = maxhere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (maxhere <= 0)
                // 如果前面位置最大连续子序列和小于等于0，则以当前位置i结尾的最大连续子序列和为a[i]
                maxhere = nums[i];
            else
                // 如果前面位置最大连续子序列和大于0，则以当前位置i结尾的最大连续子序列和为它们两者之和
                maxhere += nums[i];
            if (maxhere > maxsum) {
                // 更新最大连续子序列和
                maxsum = maxhere;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{21, -1, -3, 4, -6, 1, 2, 88, 9};

        System.out.println(new Solution().maxSubArray(temp));
    }
}
