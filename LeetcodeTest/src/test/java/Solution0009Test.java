import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0009Test {

    Solution0009 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0009();
    }

    @Test
    void normalCase() {
        int num = 121;
        System.out.println(solution.isPalindrome(num));
    }

    @Test
    void normalCase1() {
        int num = -121;
        System.out.println(solution.isPalindrome(num));
    }
}