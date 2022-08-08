import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0209Test {

    Solution0209 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0209();
    }

    @Test
    void normalCase() {
        int[] numbers = new int[]{2,3,1,2,4,3};
        int target = 7;
        System.out.println(solution.minSubArrayLen(target, numbers));
    }

    @Test
    void case2() {
        int[] numbers = new int[]{1,1,1,1,1,1,1,1};
        int target = 11;
        System.out.println(solution.minSubArrayLen(target, numbers));
    }

    @Test
    void case3() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(solution.minSubArrayLen(target, numbers));
    }
}