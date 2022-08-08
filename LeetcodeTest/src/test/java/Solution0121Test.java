import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0121Test {

    Solution0121 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0121();
    }

    @Test
    void normalCase() {
        int[] input = new int[]{7,1,5,3,6,4};
        System.out.println(solution.maxProfit(input));
    }

    @Test
    void unSuccessfulTradeCase() {
        int[] input = new int[]{7,6,4,3,1};
        System.out.println(solution.maxProfit(input));
    }
}