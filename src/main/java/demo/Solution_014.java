package demo;

import java.util.ArrayList;

/**
 * 判断链表是否符合回文（如 1223221）
 */

public class Solution_014 {
    public boolean isPail(ListNode head) {
        // write code here
        if (head == null) {
            return false;
        }
        ArrayList<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if(list.get(i).val != list.get(j).val){
                return false;
            }
        }
        return true;
    }
}
