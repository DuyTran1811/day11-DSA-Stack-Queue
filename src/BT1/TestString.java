package BT1;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        MyStack<Character> wStack = new MyStack<>();
        var input = new Scanner(System.in);
        System.out.println("Nhap Vao Mo chuoi String");
        var str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            wStack.push(c);

        }
        while (!wStack.isEmpty()){
            System.out.print(wStack.pop()+" ");
        }
    }
}
