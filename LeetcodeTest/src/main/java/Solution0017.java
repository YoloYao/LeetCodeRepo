/**
 * LeetCode：17.电话号码的字母组合
 * Description：给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 答案可以按 任意顺序 返回。
 * 示例 1:
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2:
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 * Solution：使用回溯法，构造递归函数
 * 使用哈希表初始化存储每个数字对应字符
 * 读取当前字符时，将当前字符传入下一个数字的解析流程，递归拼接
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution0017 {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        Map<String, String[]> letterMap = initMap();
        List<String> result = new ArrayList<>();
        return roll(0, digits.split(""), "", letterMap, result);
    }

    private List<String> roll(int index, String[] digits, String input,
                              Map<String, String[]> letterMap, List<String> result) {
        if (index == digits.length) {
            // 下标移动至尾部时返回结果
            return result;
        } else {
            for (String str : letterMap.get(digits[index])) {
                // 拼接前缀字符和当前字符
                String localStr = input + str;
                if (index == digits.length - 1 || digits.length == 1) {
                    // 下标移动到最后一个数字，或仅有一个数字的情况才添加字符串
                    result.add(localStr);
                }
                result = (roll(index + 1, digits, localStr, letterMap, result));
            }
        }
        return result;
    }

    private Map<String, String[]> initMap() {
        Map<String, String[]> letterMap = new HashMap<>();
        letterMap.put("2", new String[]{"a", "b", "c"});
        letterMap.put("3", new String[]{"d", "e", "f"});
        letterMap.put("4", new String[]{"g", "h", "i"});
        letterMap.put("5", new String[]{"j", "k", "l"});
        letterMap.put("6", new String[]{"m", "n", "o"});
        letterMap.put("7", new String[]{"p", "q", "r", "s"});
        letterMap.put("8", new String[]{"t", "u", "v"});
        letterMap.put("9", new String[]{"w", "x", "y", "z"});
        return  letterMap;
    }
}