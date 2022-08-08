import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0167Test {

    Solution0167 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0167();
    }

    @Test
    void normalCase() {
        int[] numbers = new int[]{2,7,11,15};
        int target = 9;
        int[] result = solution.twoSum(numbers, target);
        for (int num : result) {
            System.out.println(num);
        }
    }

    @Test
    void case2() {
        int[] numbers = new int[]{2,3,4};
        int target = 6;
        int[] result = solution.twoSum(numbers, target);
        for (int num : result) {
            System.out.println(num);
        }
    }

    @Test
    void case3() {
        int[] numbers = new int[]{-1,0};
        int target = -1;
        int[] result = solution.twoSum(numbers, target);
        for (int num : result) {
            System.out.println(num);
        }
    }
}