import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0004Test {

    Solution0004 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0004();
    }

    @Test
    void normalCase() {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }
}