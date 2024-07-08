public class Solution {

    public static void main(String[] args) {

        int num = 15;
        //odd /2
        //even +1 -1
        // 1
        //f(n) = f(n / 2) + 1
        // f(n) = min(f(n - 1), f(n + 1))
        int[] dp = new int[num + 1];
        dp[1] = 0;
        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                dp[i] = dp[i / 2] + 1;
            } else {
                dp[i] = Math.min(dp[i - 1], dp[i + 1]) + 1;
            }
        }
        System.out.println(dp[num]);
    }

   private boolean isMatch(int[] nums, int k, int startIndex) {
        // 2, 3, 5, 3, 2
        int n = nums.length;
        if (startIndex >= n) return true;
        for (int i = startIndex; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (k == 0) {
                    return false;
                }
                boolean isMatch0 = isMatch(nums, k - 1, i + 1);
                nums[i + 1] = nums[i];
                boolean isMatch1 = isMatch(nums, k - 1, i);
                return isMatch0 || isMatch1;
            }
        }
        return true;
   }
}
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }