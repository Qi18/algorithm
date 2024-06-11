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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode virHead = new ListNode();
        virHead.next = head;
        ListNode cur = virHead;
        for (int i = 0; i < left - 1; i++) cur = cur.next;
        ListNode firstIn = cur, firstOut = cur.next;
        cur = virHead;
        for (int i = 0; i < right; i++) cur = cur.next;
        ListNode lastIn = cur, lastOut = cur.next;
        lastIn.next = null;
        reverse(firstOut);
        firstIn.next = lastIn;
        firstOut.next = lastOut;
        return virHead.next;
    }

    private void reverse(ListNode head) {
        ListNode prev_cur = null, cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev_cur;
            prev_cur = cur;
            cur = temp;
        }
    }
}

//区间内反转，普通反转的升级版