交替打印ABC
+ 思路：检测一个值为1打印A，检测一个值为2打印B，检测一个值为3打印C，不正确就wait(),打印后notifyAll()。


```java
public class ABCPrinter {
    private final int max;
    // ⽤来指示当前应该打印的线程序号，0-A, 1-B, 2-C
    private int turn = 0;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition conditionA = lock.newCondition();
    private final Condition conditionB = lock.newCondition();
    private final Condition conditionC = lock.newCondition();
```