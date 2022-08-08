import java.util.HashMap;
import java.util.Map;

class Solution0167 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int num = target - numbers[i];
            if (map.containsKey(num) && map.get(num) != i) {
                return new int[]{i + 1, map.get(num) + 1};
            }
        }
        return new int[]{0, 0};
    }
}