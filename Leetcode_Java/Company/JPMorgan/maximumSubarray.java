package Leetcode_Java.Company.JPMorgan;

public class maximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
            int curr = 0;
            for (int j = i; j < nums.length; j++) {
                curr += nums[j];
                max = Math.max(curr , max);
            }
        }
            return max;
    }
}
