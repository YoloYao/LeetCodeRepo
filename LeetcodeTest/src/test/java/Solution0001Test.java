import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0001Test {

    Solution0001 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0001();
    }

    @Test
    void normalCase() {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        for (int num : result) {
            System.out.println(num);
        }
    }
}