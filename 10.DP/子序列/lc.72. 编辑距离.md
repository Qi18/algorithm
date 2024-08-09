## 题目
给你两个单词 word1 和 word2， 请返回将 word1 转换成 word2 所使用的最少操作数  。

你可以对一个单词进行如下三种操作：

插入一个字符
删除一个字符
替换一个字符


示例 1：

输入：word1 = "horse", word2 = "ros"
输出：3
解释：
horse -> rorse (将 'h' 替换为 'r')
rorse -> rose (删除 'r')
rose -> ros (删除 'e')
## 题解
```java
class Solution {
    public int minDistance(String word1, String word2) {
    // f(m, n) = f(m - 1, n - 1) if w1[m] == w2[n]
    // f(m, n) = min(f(m - 1, n), f(m - 1, n - 1), f(m, n - 1)) + 1
    // init:f(0, n) = n;f(m, 0) = m
    // res:f(m, n)
    }
}
```