import java.util.HashMap;
import java.util.Map;

class Solution0001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int index = 0;
        for (int num : nums) {
            if (numMap.containsKey(target - num)) {
                return new int[]{index, numMap.get(target - num)};
            }
            numMap.put(num, index);
            index++;
        }
        return new int[]{};
    }
}