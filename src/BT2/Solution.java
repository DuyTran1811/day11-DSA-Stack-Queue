package BT2;

public class Solution {
    static class Nodes {
        int data;
        Nodes link;
    }

    static class Queue {
        Nodes front, rear;
    }

    // phương thức tạo danh sách liên kết vòng
    static void enQueue(Queue q, int value) {
        Nodes temp = new Nodes();
        temp.data = value;
        if (q.front == null)
            q.front = temp;
        else
            q.rear.link = temp;
        q.rear = temp;
        q.rear.link = q.front;
    }

    // phương thức xoá phần tử trong liên kết vòng
    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }
        // nếu đây là nút cuối cùng bị xoá
        int value; // giá trị được định
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Nodes temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    // hàm hiển thị các hàng đợi các phần tử của vòng
    static void displayQueue(Queue q) {
        Nodes temp = q.front;
        System.out.printf("\nHàng đợi còn lại vòng là : ");
        while (temp.link != q.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);
        displayQueue(q);
        System.out.printf("\nXoá dữ liệu = %d", deQueue(q));
        System.out.printf("\nXoá dữ liệu = %d", deQueue(q));
        displayQueue(q);
        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);
    }
}
