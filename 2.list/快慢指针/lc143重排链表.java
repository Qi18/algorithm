/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//暴力解法，时间复杂度为O(n2)
class Solution {
    public void reorderList(ListNode head) {
        ListNode cur = head, cur2 = cur;
        while (cur != null) {
            if (cur.next == null) break;
            while(cur2.next.next != null) cur2 = cur2.next;
            ListNode last = cur2.next;
            cur2.next = null;
            last.next = cur.next;
            cur.next = last;
            cur = cur.next.next;
            cur2 = cur;
        }

    }
}

//注意到目标链表即为将原链表的左半端和反转后的右半端合并后的结果。
//时间复杂度为O(1)


