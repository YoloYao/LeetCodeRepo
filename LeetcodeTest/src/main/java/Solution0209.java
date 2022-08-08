import java.util.ArrayList;
import java.util.List;

class Solution0209 {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int subNum = 0;
        int min = nums.length;
        int total = 0;
        List<Integer> list = new ArrayList<>();
        while (end < nums.length) {
            if (total < target) {
                total += nums[end];
            }
            subNum += nums[end];
            list.add(end);
            end++;
            if (subNum >= target) {
                min = Math.min(min, list.size());
            }
            while (subNum >= target && start < end) {
                min = Math.min(min, list.size());
                subNum -= nums[start];
                list.remove(0);
                start++;
            }
        }
        if (total < target) {
            return 0;
        }
        return min;
    }
}