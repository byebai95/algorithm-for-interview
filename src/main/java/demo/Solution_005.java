package demo;

/**
 * 反转单向链表
 *
 */
class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}


public class Solution_005 {

    public ListNode ReverseList(ListNode head) {
        ListNode pre = null, p = head;
        while (p.next != null){
            pre = head;
            head = p.next;
            p.next = head.next;
            head.next = pre;
        }

        // write code here
        return head;
    }
}