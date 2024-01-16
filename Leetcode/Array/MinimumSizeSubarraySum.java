package Leetcode.Array;

public class MinimumSizeSubarraySum {
    /*
    Viable Sized Window
    This time we are only using two pointer left and right to count the sum
    we keep adding right pointer value into sum
    If the sum is equal or bigger than target , we need to move left point forward
        1. subtract left point number, so we have room to adding new index
        2. Comparing the minimal the length of window by right - left + 1
        3. left pointer move forward

    and finally return minSize by checking is still Integer.MAX_VALUE ?
        1. if yes , we know there is no sum number match target : so return 0
        2. if no , we know there is some sum number match target : so return minSize
        */

        public int minSubArrayLen(int target , int[] nums) {
            int left = 0 , sum = 0 , minSize = Integer.MAX_VALUE;

            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];

                while (sum >= target) {
                    sum -= nums[left];
                    minSize = Math.min(minSize , right - left + 1);
                    left++;
                }
            }
            return minSize == Integer.MAX_VALUE ? 0 : minSize;
        }
}



