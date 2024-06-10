package demo;

/**
 * 返回2个链表的第一个公共节点
 */
public class Solution_013 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        while (pHead1!=null){
            ListNode tempNode = pHead2;
            while (tempNode!=null){
                if(pHead1 == tempNode){
                    return pHead1;
                }
                tempNode = tempNode.next;
            }
            pHead1 = pHead1.next;
        }
        return null;
    }
}
