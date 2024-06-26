package Leetcode_Java.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {

        //The whole idea is to store the number into HashMap
        //First , we create an object to store target - nums[i];
        //If the target match , return their index

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compare = target - nums[i];
            if (map.containsKey(compare)) {
                return new int[] { map.get(compare), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    /*JS version
    var twoSum = function(nums, target) {
        let map = new Map();

        for (let i = 0; i < nums.length; i++) {
            let compare = target - nums[i];

            if (map.has(compare)) {
                return [map.get(compare) , i];
            }

            map.set(nums[i] , i);
        }

        return [-1 , -1];
    };

     */
}
