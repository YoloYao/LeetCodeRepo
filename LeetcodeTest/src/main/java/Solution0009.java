/**
 * LeetCode：9.回文数
 * Description：给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 示例 1:
 * 输入：x = 121
 * 输出：true
 * Solution：转为字符串判断对称位置数是否一致
 */
class Solution0009 {
    public boolean isPalindrome(int x) {
        // 负数一定非回文数
        if (x < 0) {
            return  false;
        }
        // 一位数一定是回文数
        if (x < 10) {
            return true;
        }
        String str = String.valueOf(x);
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
