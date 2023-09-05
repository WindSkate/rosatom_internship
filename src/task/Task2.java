package task;

public class Task2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 9;
        System.out.println("Before: a = " + a + ", b = " + b);

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("After:  a = " + a + ", b = " + b);
    }
}
