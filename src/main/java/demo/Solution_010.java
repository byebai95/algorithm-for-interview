package demo;

/**
 * 合并2个有序列表
 */

public class Solution_010 {

    public ListNode Merge(ListNode pHead1, ListNode pHead2) {
        // write code here
        if (pHead1 == null) {
            return pHead2;
        }
        if (pHead2 == null) {
            return pHead1;
        }

        ListNode head, preNode;
        if (pHead1.val < pHead2.val) {
            preNode = pHead1;
            head = pHead1;
            pHead1 = pHead1.next;
        } else {
            preNode = pHead2;
            head = pHead2;
            pHead2 = pHead2.next;
        }

        while (pHead1 != null && pHead2 != null) {
            if (pHead1.val < pHead2.val) {
                preNode.next = pHead1;
                preNode = pHead1;
                pHead1 = pHead1.next;

            } else {
                preNode.next = pHead2;
                preNode = pHead2;
                pHead2 = pHead2.next;
            }
        }
        if (pHead1 != null) {
            preNode.next = pHead1;
        }
        if (pHead2 != null) {
            preNode.next = pHead2;
        }
        return head;
    }

}