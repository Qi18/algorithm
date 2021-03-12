public class Solution {

    public static void main(String[] args) {
        int[] b=new int[]{-1*5};
        System.out.println(b[0]);
        Solution a=new Solution();
        ListNode a1=new ListNode(9);
        ListNode a2=new ListNode(9,a1);
        ListNode a3=new ListNode(9,a2);
        ListNode a4=new ListNode(9,a3);
        ListNode a5=new ListNode(9);
        ListNode a6=new ListNode(9,a5);
        ListNode a7=new ListNode(9,a6);
        ListNode a8=new ListNode(9,a7);
        ListNode k=a.addTwoNumbers(a4,a8);
        while(k!=null){
            System.out.print(k.val);
            k=k.next;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode tail=null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + carry;
            if (head == null) {
                head = new ListNode(sum % 10);
                tail = head;
            } else {
                tail.next  = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = (l1.val + l2.val) / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if(carry==1)tail.next=new ListNode(1);
        return head;
    }
}
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }