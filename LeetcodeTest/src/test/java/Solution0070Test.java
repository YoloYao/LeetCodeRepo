import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Solution0070Test {
    Solution0070 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0070();
    }

    @Test
    void normalCase() {
        int x = 3;
        System.out.println(solution.climbStairs(x));
    }

    @Test
    void climb10FloorCase() {
        int x = 10;
        System.out.println(solution.climbStairs(x));
    }
}