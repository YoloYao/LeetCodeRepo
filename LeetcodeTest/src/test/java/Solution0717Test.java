import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0717Test {

    Solution0717 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0717();
    }

    @Test
    void normalCase() {
        int[] nums = new int[]{1,0,0};
        System.out.println(solution.isOneBitCharacter(nums));
    }

    @Test
    void case2() {
        int[] nums = new int[]{1,1,1,0};
        System.out.println(solution.isOneBitCharacter(nums));
    }
}