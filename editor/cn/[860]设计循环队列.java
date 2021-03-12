//设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”
//。 
//
// 循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环
//队列，我们能使用这些空间去存储新的值。 
//
// 你的实现应该支持如下操作： 
//
// 
// MyCircularQueue(k): 构造器，设置队列长度为 k 。 
// Front: 从队首获取元素。如果队列为空，返回 -1 。 
// Rear: 获取队尾元素。如果队列为空，返回 -1 。 
// enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。 
// deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。 
// isEmpty(): 检查循环队列是否为空。 
// isFull(): 检查循环队列是否已满。 
// 
//
// 
//
// 示例： 
//
// MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
//circularQueue.enQueue(1);  // 返回 true
//circularQueue.enQueue(2);  // 返回 true
//circularQueue.enQueue(3);  // 返回 true
//circularQueue.enQueue(4);  // 返回 false，队列已满
//circularQueue.Rear();  // 返回 3
//circularQueue.isFull();  // 返回 true
//circularQueue.deQueue();  // 返回 true
//circularQueue.enQueue(4);  // 返回 true
//circularQueue.Rear();  // 返回 4 
//
// 
//
// 提示： 
//
// 
// 所有的值都在 0 至 1000 的范围内； 
// 操作数将在 1 至 1000 的范围内； 
// 请不要使用内置的队列库。 
// 
// Related Topics 设计 队列 
// 👍 173 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class MyCircularQueue {

<<<<<<< HEAD
    int[] Queue;

    public MyCircularQueue(int k) {
        Queue=new int[k];
    }
    
    public boolean enQueue(int value) {

    }
    
    public boolean deQueue() {

    }
    
    public int Front() {

    }
    
    public int Rear() {

    }
    
    public boolean isEmpty() {

    }
    
    public boolean isFull() {

=======
    private int [] queue;
    private int head=-1;
    private int tail=-1;
    private int length=0;

    public MyCircularQueue(int k) {
        queue = new int[k];
    }

    public boolean enQueue(int value) {
        if (length >= queue.length) return false;
        if(head==-1)head++;
        length++;
        queue[(head+length-1)%queue.length] = value;
        return true;
 }

    public boolean deQueue() {
        if (length == 0) return false;
        queue[head]=-1;
        head=(head+1)%queue.length;
        length--;
        return true;
    }

    public int Front() {
        if(length==0)return -1;
        return queue[head];
    }

    public int Rear() {
        if(length==0)return -1;
        return queue[(head+length-1)%queue.length];
    }

    public boolean isEmpty() {
        if(length==0)return true;
        else return false;
    }

    public boolean isFull() {
        if(length==queue.length)return true;
        else return false;
>>>>>>> 83ee630d3491857d7a18cc34c138cafb51a326e9
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
//leetcode submit region end(Prohibit modification and deletion)
