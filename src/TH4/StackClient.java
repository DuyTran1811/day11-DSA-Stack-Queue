package TH4;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(5);
        myStack.push(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);

        System.out.println("1 : Kich thuoc cac phan tu da duoc day vao " + myStack.size());
        System.out.println("2: Lay da tu ngan sep");
        while (!myStack.isEmty()) {
            System.out.printf("%d ", myStack.pop());
        }
        System.out.println("\n3.Kích thước của ngăn xếp sau các hoạt động bật:"+myStack.size());
    }
}
