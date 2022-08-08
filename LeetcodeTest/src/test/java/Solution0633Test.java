import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0633Test {

    Solution0633 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0633();
    }

    @Test
    void normalCase() {
        int x = 5;
        System.out.println(solution.judgeSquareSum(x));
    }

    @Test
    void falseCase() {
        int x = 3;
        System.out.println(solution.judgeSquareSum(x));
    }
}