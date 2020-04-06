package com.cgj.leet.code.explore.april.week1_1;

/**
 * Single Number
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example 1:
 * <p>
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: [4,1,2,1,2]
 * Output: 4
 */


class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                return nums[i];
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[j];
                    nums[j] = temp;

                    i++;
                    break;
                }
                if (j == nums.length - 1) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] temp1 = new int[]{1};
        int[] temp2 = new int[]{2, 1, 3, 2, 1};

        System.out.println(new Solution().singleNumber(temp1));
        System.out.println(new Solution().singleNumber(temp2));
    }

}
