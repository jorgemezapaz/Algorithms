package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void findTwoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        Integer target = 9;
        int[] result = new int[]{0, 1};
        Assertions.assertArrayEquals(result, TwoSum.findTwoSum(nums, target));
    }

    @Test
    void findTwoSum2() {
        int[] nums = new int[]{3, 2, 4};
        Integer target = 6;
        int[] result = new int[]{1, 2};
        Assertions.assertArrayEquals(result, TwoSum.findTwoSum(nums, target));
    }

    @Test
    void findTwoSum3() {
        int[] nums = new int[]{3, 3};
        Integer target = 6;
        int[] result = new int[]{0, 1};
        Assertions.assertArrayEquals(result, TwoSum.findTwoSum(nums, target));
    }

    @Test
    void findTwoSum4() {
        int[] nums = new int[]{-1,-2,-3,-4,-5};
        Integer target = -8;
        int[] result = new int[]{2,4};
        Assertions.assertArrayEquals(result, TwoSum.findTwoSum(nums, target));
    }
}