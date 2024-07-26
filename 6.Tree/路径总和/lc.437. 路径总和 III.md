## 题目
给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。

路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。

## 题解
+ 前缀和存储之前的和，减少重复计算的次数

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        preSumMap = new HashMap<>();
        preSumMap.put(0L, 1);
        sum = 0L;
        ans = 0;
        dfs(root, targetSum);
        return ans;
    }

    private void dfs(TreeNode root, int targetSum) {
        if (root == null) return;
        sum += root.val;
        if (preSumMap.getOrDefault(sum - targetSum, 0) > 0) {
            ans += preSumMap.get(sum - targetSum);
        }
        preSumMap.put(sum, preSumMap.getOrDefault(sum, 0) + 1);
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
        preSumMap.put(sum, preSumMap.getOrDefault(sum, 0) - 1);
        sum -= root.val;
    }

    private Map<Long, Integer> preSumMap;
    private long sum;
    private int ans;


}
```