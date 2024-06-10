package demo;

/**
 * 判断链表是否存在环
 */

public class Solution_011 {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast.val == slow.val) {
                return true;
            }
        }
        return false;
    }

}
