/**
 * LeetCode：21.合并两个有序链表
 * Description：将两个升序链表合并为一个新的 升序 链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 * 示例 1:
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * Solution：利用升序的条件构造循环依次在新链表中填入较小值，
 * 关键要正确处理结束循环条件，防止遗漏未解析的节点
 */
class Solution0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 存在空链表
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode result = new ListNode();
        ListNode leftNode = list1;
        ListNode rightNode = list2;
        ListNode localNode = result;
        // 依次在结果链表中添加较小值
        while (leftNode != null && rightNode != null) {
            int minVal = 0;
            if (leftNode.val < rightNode.val) {
                minVal = leftNode.val;
                leftNode = leftNode.next;
            } else {
                minVal = rightNode.val;
                rightNode = rightNode.next;
            }
            localNode.next = new ListNode(minVal);
            localNode = localNode.next;
        }
        // 处理未遍历到的节点
        ListNode exactNode;
        if (leftNode == null) {
            exactNode = rightNode;
        } else {
            exactNode = leftNode;
        }
        while (exactNode != null) {
            localNode.next = new ListNode(exactNode.val);
            localNode = localNode.next;
            exactNode = exactNode.next;
        }
        return result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}