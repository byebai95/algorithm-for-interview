package demo;

/**
 * 输出链表最后K个节点
 */
public class Solution_012 {
    public ListNode FindKthToTail(ListNode pHead, int k) {
        // write code here
        int length = 0;
        ListNode temp = pHead;
        while (temp != null) {
            temp = temp.next;
            length += 1;
        }
        if (length < k) {
            return null;
        }
        for (int i = 0; i < length - k; i++) {
            pHead = pHead.next;
        }
        return pHead;
    }
}
