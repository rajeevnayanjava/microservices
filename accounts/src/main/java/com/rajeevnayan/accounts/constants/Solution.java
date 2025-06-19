package com.rajeevnayan.accounts.constants;

public class Solution {
    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int a ,b ;
        a=Integer.MAX_VALUE;
        b=Integer.MAX_VALUE;
        for (int num : nums) {
            if (b >= num) {
                b = num;
            } else if (a >= num) {
                a = num;
            } else {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[] {2,1,5,0,4,6}));
    }
}
