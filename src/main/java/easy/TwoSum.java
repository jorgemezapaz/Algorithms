package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //https://leetcode.com/problems/two-sum/submissions/
    public static int[] findTwoSum(int[] nums, Integer target) {
        if (nums.length == 0) return new int[]{};
        Map<Integer, Integer> mem = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (mem.containsKey(diff)) {
                return new int[]{mem.get(diff), i};
            }
            mem.put(nums[i], i);
        }
        return new int[]{};
    }
}
