/**
 * LeetCode：121.买卖股票的最佳时机
 * Description：给定一个数组 prices ，
 * 它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。
 * 设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 * 示例 1:  输入：[7,1,5,3,6,4]  输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，
 * 在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * Solution：随时间推移完成2种动作，记录到目前为止的最佳购买方案
 * 动作1（找到最低价）：当天价格低于历史最低价，在此之后的每一个购买方案都以今天为起点
 * 动作2（找到最高价）：当天价格与历史最低价的差额为历史最大收益，则记录为当前最佳方案
 * 随时间推移不断更新最佳方案，最终返回
 */
class Solution0121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        // 记录目前为止的最低价
        int minPrice = Integer.MAX_VALUE;
        int maxEarn = 0;
        for (int price : prices) {
            if (price < minPrice) {
                // 找到新的最低价
                minPrice = price;
            } else if (price - minPrice > maxEarn) {
                // 记录当前能达到的最大盈利数
                maxEarn = price - minPrice;
            }
        }
        return maxEarn;
    }
}