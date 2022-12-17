package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    void rotate() {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        int[] result = new int[]{5,6,7,1,2,3,4};
        RotateArray.rotateFirstSolution(nums, k);
        assertArrayEquals(nums, result);
    }

    @Test
    void rotate2(){
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        int[] result = new int[]{5,6,7,1,2,3,4};
        RotateArray.rotateSecondSolution(nums, k);
        assertArrayEquals(nums, result);
    }
}