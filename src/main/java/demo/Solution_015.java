package demo;

/**
 * 删除有序列表中重复的节点
 *
 * 1->2->2->3->4
 * 1->2->3->4
 */
public class Solution_015 {
    public ListNode deleteDuplicates(ListNode head) {
        // write code here
        ListNode tmp = head;
        while (tmp != null && tmp.next != null) {
            while (tmp.next != null && tmp.val == tmp.next.val) {
                tmp.next = tmp.next.next;
            }
            tmp = tmp.next;
        }
        return head;
    }
}
