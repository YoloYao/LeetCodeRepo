import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0011Test {

    Solution0011 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0011();
    }

    @Test
    void normalCase() {
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(arr));
    }

    @Test
    void sameHeightCase() {
        int[] arr = new int[]{1,1};
        System.out.println(solution.maxArea(arr));
    }
}