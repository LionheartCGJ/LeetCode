package com.cgj.leet.code.explore.april.week1_2_happyNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by
 * the sum of the squares of its digits, and repeat the process
 * until the number equals 1 (where it will stay), or it loops
 * endlessly in a cycle which does not include 1. Those numbers
 * for which this process ends in 1 are happy numbers.
 *
 */
class Solution {
    public boolean isHappy(int n) {
        // System.out.println(n);
        if (n < 1) {
            return false;
        }

        List<Integer> store = new ArrayList<>();
        store.add(n);

        while (true) {
            int sum = getSum(n);

            // System.out.println(sum);

            if (1 == sum) {
                return true;
            } else if (store.contains(sum)) {
                break;
            }

            n = sum;
            store.add(n);
        }

        return false;
    }

    public int getSum(int n) {
        int sum = 0;
        while (n > 9) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }

        return sum + n * n;
    }


    public static void main(String[] args) {

        for (int i = 0; i < 101; i++) {
            int temp = i;
            System.out.println(String.format("%s is happy number : %s", temp, new Solution().isHappy(temp)));
        }
    }
}