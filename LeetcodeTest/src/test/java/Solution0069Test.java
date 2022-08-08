import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Solution0069Test {

    Solution0069 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0069();
    }

    @Test
    void normalCase() {
        int x = 8;
        System.out.println(solution.mySqrt(x));
    }
}