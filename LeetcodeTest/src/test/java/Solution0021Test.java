import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0021Test {

    Solution0021 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0021();
    }

    @Test
    void normalCase() {
        Solution0021.ListNode l1 = new Solution0021.ListNode(1);
        l1.next = new Solution0021.ListNode(2);
        l1.next.next = new Solution0021.ListNode(4);
        Solution0021.ListNode l2 = new Solution0021.ListNode(1);
        l2.next = new Solution0021.ListNode(3);
        l2.next.next = new Solution0021.ListNode(4);
        Solution0021.ListNode result = solution.mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}