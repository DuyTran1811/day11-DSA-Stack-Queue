package TH1;

public class GenericStackClient {
    public static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Tow");
        stack.push("One");
        System.out.println("1.1 Kich Thuoc ngan sep sau cac hoat dong " + stack.size());
        System.out.println("Yếu tố pop từ ngăn xếp");
        while (!stack.isEmpty()) {
            System.out.printf("%s ", stack.pop());
        }
        System.out.println("\n1.3. Kích thước của ngăn xếp sau các hoạt động bật : " + stack.size());
    }

    public static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Kích thước của ngăn xếp sau các hoạt động đẩy : " + stack.size());
        System.out.println("2.2. Yếu tố pop từ ngăn xếp: ");
        while (!stack.isEmpty())
            System.out.printf(" %d", stack.pop());
        System.out.println("\n3.3 Kích thước của ngăn xếp sau các hoạt động bật lên " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Chồng số nguyên");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
