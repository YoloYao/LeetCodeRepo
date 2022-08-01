/**
 * LeetCode：5.最长回文子串
 * Description：给你一个字符串 s，找到 s 中最长的回文子串。
 * 示例 1：
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * Solution：动态规划法中的用矩阵求最大公共子串方法。
 * 回文表示正序和倒序都一样，求最大回文子串，可以转换为：
 * 求正序字符串和倒序字符串的最大公共子串（注意回文的判断）
 * 例如：存在特殊情况aacabdkacaa
 * 判断回文关键：当前正序子串第一位是不是在倒序子串最后一位倒过来的位置
 */
class Solution0005 {
    public String longestPalindrome(String s) {
        String leftStr = s;
        // 倒序字符串
        String rightStr = new StringBuilder(s).reverse().toString();
        int[][] maxArr = new int[s.length()][s.length()];
        int maxLeftEndPosition = s.length() - 1;
        int maxNum = 0;
        // 填充表格中连续相同最大值
        for (int i = 0; i < leftStr.length(); i++) {
            for (int j = 0; j < rightStr.length(); j++) {
                if (leftStr.charAt(i) == rightStr.charAt(j)) {
                    if (i == 0 || j == 0) {
                        maxArr[i][j] = 1;
                    } else {
                        maxArr[i][j] = maxArr[i - 1][j - 1] + 1;
                    }
                }
                // 正序最大公共子串起始下标
                int startIndex = i + 1 - maxArr[i][j];
                // 倒序最大公共子串结束下标在正序字符串中的下标
                int convertIndex = s.length() - 1 - j;
                if (maxArr[i][j] > maxNum && startIndex == convertIndex) {
                    maxNum = maxArr[i][j];
                    maxLeftEndPosition = i;
                }
            }
        }
        // 拼出最长回文子串
        return leftStr.substring(maxLeftEndPosition + 1 - maxNum, maxLeftEndPosition + 1);
    }
}