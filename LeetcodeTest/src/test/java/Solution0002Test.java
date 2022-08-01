import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0002Test {

    Solution0002 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution0002();
    }

    @Test
    void normalCase() {
        Solution0002.ListNode l1 = new Solution0002.ListNode(2);
        l1.next = new Solution0002.ListNode(4);
        l1.next.next = new Solution0002.ListNode(3);
        Solution0002.ListNode l2 = new Solution0002.ListNode(5);
        l2.next = new Solution0002.ListNode(6);
        l2.next.next = new Solution0002.ListNode(4);
        Solution0002.ListNode result = solution.addTwoNumbers(l1, l2);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}