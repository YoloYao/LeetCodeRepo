/**
 * LeetCode：11.盛最多水的容器
 * Description：给定一个长度为 n 的整数数组 height 。
 * 有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。说明：你不能倾斜容器。
 * 示例 1:
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * Solution：双指针法从两端向内移动。
 * 面积S = Min(height[x], height[y]) * (y - x)
 * 当较短边不变时，垂线间距离越短，面积越小
 * 所以每次指针移动时，优先向内移动高度较小的一侧
 */
class Solution0011 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left != right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}