/**
 * LeetCode：717.1比特与2比特字符
 * Description：有两种特殊字符：
 * 第一种字符可以用一个比特 0 来表示
 * 第二种字符可以用两个比特(10 或 11)来表示、
 * 给定一个以 0 结尾的二进制数组 bits ，如果最后一个字符必须是一位字符，则返回 true 。
 * 示例 1：
 * 输入: bits = [1, 0, 0]
 * 输出: true
 * 解释: 唯一的编码方式是一个两比特字符和一个一比特字符。
 * 所以最后一个字符是一比特字符。
 * Solution：滑动窗口判断是否有0字符剩余
 * 长度为2的滑窗在数组中从左往右移动
 * 0开头时移动一位，1开头时移动2位
 * 判断最后滑窗是否完全移出数组（结尾是否为单字符）
 */
class Solution0717 {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1) {
            return true;
        }
        int left = 0;
        int right = 1;
        while (right <= bits.length - 1) {
            if (bits[left] == 0) {
                // 滑窗以0开头时候移动1位
                right++;
                left++;
            } else {
                // 滑窗以1开头时移动2位
                left += 2;
                right += 2;
            }
        }
        // 滑窗结束移动后若未完全移出数组序列，则说明最后右单字节剩余
        return left == bits.length - 1;
    }
}