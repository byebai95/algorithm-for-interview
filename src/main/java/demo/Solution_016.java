package demo;

/**
 * 链表内指定区间反转
 */
public class Solution_016 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write code here
        if (m >= n) {
            return head;
        }
        ListNode virtualNode = new ListNode(0);
        virtualNode.next = head;

        ListNode lastHead = head, preHead = virtualNode;
        for (int i = 1; i < m ; i++) {
            preHead = head;
            head = head.next;
        }
        for (int i = 0; i < n ; i++) {
            lastHead = lastHead.next;
        }
        preHead.next = reverseList(head, lastHead);

        return virtualNode.next;
    }


    // 反转链表
    protected ListNode reverseList(ListNode head, ListNode last) {
        ListNode pre, p = head;
        while (p.next != last) {
            pre = head;
            head = p.next;
            p.next = head.next;
            head.next = pre;
        }
        return head;
    }
}
