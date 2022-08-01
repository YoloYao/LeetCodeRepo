import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0005Test {

    Solution0005 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0005();
    }

    @Test
    void normalCase() {
        String s = "babad";
        System.out.println(solution.longestPalindrome(s));
    }

    @Test
    void normalCase1() {
        String s = "cbbd";
        System.out.println(solution.longestPalindrome(s));
    }
}