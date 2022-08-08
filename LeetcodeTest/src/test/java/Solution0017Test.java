import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0017Test {

    Solution0017 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0017();
    }

    @Test
    void normalCase() {
        String digits = "23";
        System.out.println(solution.letterCombinations(digits));
    }

}