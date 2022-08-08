import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0542Test {

    Solution0542 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0542();
    }

    @Test
    void normalCase() {
        int[][] mat = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        int[][] result = solution.updateMatrix(mat);
        for (int[] out : result) {
            for (int num : out) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("Success");
    }

    @Test
    void case2() {
        int[][] mat = new int[][]{{0,0,0},{0,1,0},{1,1,1}};
        int[][] result = solution.updateMatrix(mat);
        for (int[] out : result) {
            for (int num : out) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("Success");
    }
}