import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode：15.三数之和
 * Description：给你一个包含 n 个整数的数组 nums，
 * 判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
 * 请你找出所有和为 0 且不重复的三元组。
 * 示例 1:
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 示例 2:
 * 输入：nums = []
 * 输出：[]
 * Solution：先排序，再用双指针
 * 用两数相加为0类推。取出第一个数，以该数和0的差值作为
 * 剩余两数相加的目标值。
 * 注意：要求没有重复值，所以遇到重复值需要跳过
 */
class Solution0015 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List <Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                continue;
            }
            // Note1：全是0的情况未考虑到，详见用例AllZeroCase()
            while (i < nums.length && i > 0 && nums[i] == nums[i - 1]) {
                i++;
            }
            if (i >= nums.length) {
                continue;
            }
            // end of Note1
            int target = 0 - nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    List<Integer> localList = new ArrayList<>();
                    localList.add(nums[i]);
                    localList.add(nums[left]);
                    localList.add(nums[right]);
                    result.add(localList);
                    // Note2:判断条件错误，应该是nums[left] == nums[left + 1]，和下一个比较，
                    // 而不是nums[left] == nums[left - 1]，和前一个比较。详见用例specialCase()
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (nums[left] + nums[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}