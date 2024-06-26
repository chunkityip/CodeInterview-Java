package Leetcode_Java.Array;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicateBySorting(int[] nums) {
        /*
        By sorting the array , comparing the prev integer and +1 index integer,
        if they are same , return true , else , return false.
         */
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) return true;
            }

            return false;
        }



    public static boolean containsDuplicateByHashSet(int[] nums) {
        /*
          Create HashSet call set
          Iterate each index , add it into set
          If the current index already contain in set , return true

          Iterate over , there have no match , return false
        */
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }
        return false;
    }
}
