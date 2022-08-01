import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Solution0015Test {
    Solution0015 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0015();
    }

    @Test
    void normalCase() {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(nums));
    }

    @Test
    void allZeroCase() {
        int[] nums = new int[]{0,0,0,0};
        System.out.println(solution.threeSum(nums));
    }

    @Test
    void specialCase() {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(nums));
    }
}