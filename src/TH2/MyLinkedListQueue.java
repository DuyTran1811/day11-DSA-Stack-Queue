package TH2;

public class MyLinkedListQueue {
    private Nodes head;
    private Nodes tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Nodes temp = new Nodes(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Nodes dequeue() {
        if (this.head ==null)
            return null;
        Nodes temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}

class Nodes {
    public int key;
    public Nodes next;

    public Nodes(int key) {
        this.key = key;
        this.next = null;
    }
}
