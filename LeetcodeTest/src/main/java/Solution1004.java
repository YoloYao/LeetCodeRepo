import java.util.ArrayList;
import java.util.List;

class Solution1004 {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int max = 0;
        int release = k;
        List<Integer> list = new ArrayList<>();
        while (end < nums.length) {
            list.add(end);
            if (nums[end] == 0) {
                release--;
            }
            end++;
            while (release < 0) {
                if (nums[start] == 0) {
                    release++;
                }
                list.remove(0);
                start++;
            }
            max = Math.max(max, list.size());
        }
        return max;
    }
}