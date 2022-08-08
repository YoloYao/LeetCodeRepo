import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0020Test {

    Solution0020 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0020();
    }

    @Test
    void normalCase() {
        String s = "()[]{}";
        System.out.println(solution.isValid(s));
    }

    @Test
    void containCase() {
        String s = "{[]}";
        System.out.println(solution.isValid(s));
    }

    @Test
    void invalidCase() {
        String s = "([)]";
        System.out.println(solution.isValid(s));
    }
}