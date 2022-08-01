import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0003Test {

    Solution0003 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0003();
    }

    @Test
    void normalCase() {
        String s = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }

    @Test
    void allSame() {
        String s = "bbbbb";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}