import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1004Test {

    Solution1004 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution1004();
    }

    @Test
    void normalCase() {
        int[] nums = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(solution.longestOnes(nums, k));
    }

    @Test
    void case2() {
        int[] nums = new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(solution.longestOnes(nums, k));
    }
}