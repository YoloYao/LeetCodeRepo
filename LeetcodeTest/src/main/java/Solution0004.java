import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * LeetCode：4.寻找两个正序数组的中位数
 * Description：给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * 示例 1：
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 * Solution：传入数组默认为正序，可按需填入，依次遍历得出排序后结果
 * list和数组相互转换使用stream方法
 * Arrays的方法返回的是虚拟对象，需要new一个新对象存入实体
 */
class Solution0004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> list3 = new ArrayList<>();
        double result = 0;
        int index = 0;
        boolean isfinished = false;
        while (!isfinished) {
            // 依次将两个数组中当前最小的数加入list3
            if (!list1.isEmpty() && !list2.isEmpty()) {
                if (list1.get(0) < list2.get(0)) {
                    list3.add(list1.get(0));
                    list1.remove(0);
                } else {
                    list3.add(list2.get(0));
                    list2.remove(0);
                }
            } else {
                list3.addAll(list1);
                list3.addAll(list2);
                isfinished = true;
            }
        }
        int[] nums3 = list3.stream().mapToInt(Integer::valueOf).toArray();
        if (nums3.length == 1) {
            result = nums3[0];
            return result;
        }
        index = nums3.length / 2;
        // 根据奇偶数算出中位数
        if (nums3.length % 2 != 0) {
            result = nums3[index];
        } else {
            result = (double) (nums3[index - 1] + nums3[index]) / 2;
        }
        return result;
    }
}