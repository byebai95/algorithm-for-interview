package demo;


/**
 * 2个表示数子的链表相加
 */
public class Solution_019 {
    public ListNode addInList(ListNode head1, ListNode head2) {
        // write code here
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        head1 = reverseList(head1);
        head2 = reverseList(head2);

        ListNode head = null, pre = null;
        int step = 0;
        while (head1 != null && head2 != null) {
            int sum = head1.val + head2.val + step;
            step = 0;
            if (sum > 9) {
                step = 1;
                sum = sum % 10;
            }
            ListNode p = new ListNode(sum);
            if (head == null) {
                head = p;
            } else {
                pre.next = p;
            }
            pre = p;
            head1 = head1.next;
            head2 = head2.next;
        }

        ListNode node = null;
        if (head1 != null) {
            node = head1;
        } else if (head2 != null) {
            node = head2;
        }
        while (node != null) {
            int sum = node.val + step;
            step = 0;
            if (sum > 9) {
                step = 1;
                sum = sum % 10;
            }
            ListNode p = new ListNode(sum);
            pre.next = p;
            pre = p;
            node = node.next;
        }

        if (step != 0) {
            pre.next = new ListNode(step);
        }
        head = reverseList(head);
        return head;
    }

    //反转单个链表
    public ListNode reverseList(ListNode head) {
        ListNode pre, p = head;
        while (p.next != null) {
            pre = head;
            head = p.next;
            p.next = head.next;
            head.next = pre;
        }

        // write code here
        return head;
    }
}
