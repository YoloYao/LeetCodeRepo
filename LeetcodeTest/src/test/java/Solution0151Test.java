import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0151Test {

    Solution0151 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0151();
    }

    @Test
    void normalCase() {
        String s = "the sky is blue";
        System.out.println(solution.reverseWords(s));
    }

    @Test
    void specialSpaceCase() {
        String s = "  hello world  ";
        System.out.println(solution.reverseWords(s));
    }

    @Test
    void doubleSpaceCase() {
        String s = "a good   example";
        System.out.println(solution.reverseWords(s));
    }
}