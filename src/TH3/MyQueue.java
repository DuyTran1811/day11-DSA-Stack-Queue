package TH3;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) status = true;
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) status = true;
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Tràn ! Không thể thêm phần tử" + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Phan Tu " + item + " được đẩy vào hàng đợi ");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Không thể xóa phần tử khỏi Hàng đợi");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Thao tác bật đã hoàn tất! loại bỏ: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("hao tác bật đã hoàn tất! loại bỏ: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        myQueue.enqueue(4);
        myQueue.dequeue();
        myQueue.enqueue(56);
        myQueue.enqueue(2);
        myQueue.enqueue(67);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.enqueue(24);
        myQueue.dequeue();
        myQueue.enqueue(98);
        myQueue.enqueue(45);
        myQueue.enqueue(23);
        myQueue.enqueue(435);
    }
}
