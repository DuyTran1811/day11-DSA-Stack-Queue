package BT1;

import java.util.Scanner;

public class TestInterger {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        var input = new Scanner(System.in);
        System.out.println("Nhap So Luong Phan Tu");
        var n = input.nextInt();
        for (int i = 0; i < n; i++) {
            myStack.push(i);
        }
        System.out.println("Cac Phan Tu Sau Khi dao");
        while (!myStack.isEmpty()){
            System.out.print(myStack.pop()+" ");
        }
    }
}
