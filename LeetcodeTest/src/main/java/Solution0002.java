/**
 * LeetCode：2.两数相加
 * Description：给你两个 非空 的链表，表示两个非负的整数。
 * 它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 示例 1：
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * Solution：一次遍历将当前位的数字相加存入当前节点，遍历期间判断进位和停止遍历条件
 * 不必关注两个输入相加后的总值，只需要关注当前位相加后的值以及是否需要进位
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode();
        boolean isFinish = false;
        boolean isAdd = false;
        ListNode fstNode = l1;
        ListNode scdNode = l2;
        ListNode localNode = resultNode;
        while (!isFinish) {
            int localValue = 0;
            // 可能存在单个节点为空的情况，需要分别判断
            if (fstNode != null) {
                localValue += fstNode.val;
                fstNode = fstNode.next;
            }
            if (scdNode != null) {
                localValue += scdNode.val;
                scdNode = scdNode.next;
            }
            // 判断前一位是否有进位
            if (isAdd) {
                localValue++;
            }
            isAdd = localValue > 9;
            localValue = localValue > 9 ? localValue % 10 : localValue;
            localNode.val = localValue;
            // 判断是否还存在未相加的数
            if (fstNode == null && scdNode == null && !isAdd) {
                isFinish = true;
                continue;
            }
            localNode.next = new ListNode();
            localNode = localNode.next;
        }
        return resultNode;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}