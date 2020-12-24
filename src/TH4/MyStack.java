package TH4;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Ngan Sep Da Day");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception {
        if (isEmty()) {
            throw new Exception("Ngăn xếp rỗn");
        }
        return arr[--index];
    }

    public boolean isEmty() {
        if (index ==0) return true;
        return false;
    }

    public boolean isFull() {
        if (index == 0) return true;
        return false;
    }

    public int size() {
        return index;
    }
}
