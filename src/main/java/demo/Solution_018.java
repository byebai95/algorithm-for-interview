package demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 单链表排序
 */
public class Solution_018 {
    public ListNode sortInList(ListNode head) {
        // write code here

        ListNode ans = new ListNode(0);
        ans.next = head;

        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        Collections.sort(arr);

        head = ans.next;
        for (Integer integer : arr) {
            head.val = integer;
            head = head.next;
        }
        return ans.next;
    }
}
