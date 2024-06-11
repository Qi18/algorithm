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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode virHead = new ListNode();
        virHead.next = head;
        ListNode cur = virHead;
        while (cur != null) {
            ListNode firstIn = cur, firstOut = cur.next;
            for (int i = 0; i < k; i++) {
                if (cur != null) cur = cur.next;
            }
            if (cur == null) break;
            ListNode lastIn = cur, lastOut = cur.next;
            lastIn.next = null;
            reverse(firstOut);
            firstIn.next = lastIn;
            firstOut.next = lastOut;
            cur = firstOut;
        }
        return virHead.next;
    }

    private void reverse(ListNode head) {
        ListNode tail = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = tail;
            tail = head;
            head = temp;
        }
    }
}

// 记录四个节点