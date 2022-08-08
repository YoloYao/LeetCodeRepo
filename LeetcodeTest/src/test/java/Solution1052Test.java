import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1052Test {

    Solution1052 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution1052();
    }

    @Test
    void normalCase() {
        int[] customers = new int[]{1,0,1,2,1,1,7,5};
        int[] grumpy = new int[]{0,1,0,1,0,1,0,1};
        int minutes = 3;
        System.out.println(solution.maxSatisfied(customers, grumpy, minutes));
    }

    @Test
    void case2() {
        int[] customers = new int[]{1};
        int[] grumpy = new int[]{0};
        int minutes = 1;
        System.out.println(solution.maxSatisfied(customers, grumpy, minutes));
    }
}