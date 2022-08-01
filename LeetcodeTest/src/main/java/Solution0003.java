import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode：3.无重复字符的最长子串
 * Description：给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * Solution：遇到子串问题可联想到滑动窗口；
 * 右指针遇到已有字符或右边界前向右移动；左指针在右指针停止移动后向右移动一位
 * 每次左指针移动后，要删除最左的字符在Set中的存放内容
 */
class Solution0003 {
    public int lengthOfLongestSubstring(String s) {
        // 输入为空或1位的特殊处理
        if (s.length() <= 1) {
            return s.length();
        }
        Set<Character> foundSet = new HashSet<>();
        int max = 0;
        int right = 0;
        for (int start = 0; start < s.length(); start++) {
            if (start > 0) {
                // 左指针移动后，移除已删除字符在Set中的存储
                foundSet.remove(s.charAt(start - 1));
            }
            // 右指针移动到最右或遇到重复字符时停止移动
            while (right < s.length() && !foundSet.contains(s.charAt(right))) {
                foundSet.add(s.charAt(right));
                right++;
            }
            max = Math.max(max, right - start);
        }
        return max;
    }
}