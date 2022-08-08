import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0367Test {

    Solution0367 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0367();
    }

    @Test
    void normalCase() {
        int x = 14;
        System.out.println(solution.isPerfectSquare(x));
    }

    @Test
    void case2() {
        int x = 16;
        System.out.println(solution.isPerfectSquare(x));
    }
}