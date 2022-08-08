/**
 * LeetCode：151.颠倒字符串中的单词
 * Description：给定一个字符串 s ，返回单词 顺序颠倒 且单词之间用 单个空格 连接的结果字符串。
 * 颠倒后的字符串中不能存在前导空格和尾随空格。
 * 如果两个单词间有多余的空格，颠倒后的字符串需要将单词间的空格减少到仅有一个。
 * 示例 1:
 * 输入: s = "the sky is blue"
 * 输出: "blue is sky the"
 * Solution：1.使用正则替换多个连续空格；
 * 2.倒序循环拼接字符串；
 * 3.首尾空格去除；
 */
class Solution0151 {
    public String reverseWords(String s) {
        // 将连续空格替换为1个空格
        String inputStr = s.replaceAll("\\s+", " ");
        if (inputStr.length() < 2) {
            return inputStr;
        }
        // 去除第一个空格
        if (inputStr.charAt(0) == ' ') {
            inputStr = inputStr.replaceFirst(" ", "");
        }
        StringBuilder builder = new StringBuilder();
        String[] inputArr = inputStr.split(" ");
        for (int i = inputArr.length - 1; i > -1; i--) {
            builder.append(inputArr[i]);
            if (i > 0) {
                builder.append(" ");
            }
        }
        String outputStr = builder.toString();
        // 去除倒序后第一个空格
        if (outputStr.charAt(0) == ' ') {
            outputStr = outputStr.replaceFirst(" ", "");
        }
        return outputStr;
    }
}