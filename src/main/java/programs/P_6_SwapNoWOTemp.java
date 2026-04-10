package programs;

public class P_6_SwapNoWOTemp {
    public static void main(String[] args) {
        int a = 110;
        int b = 220;

        System.out.println("Before Swap: ");
        System.out.println("a: " + a + "\t b: " + b);
        a = a + b;
        b = a - b;
        a = Math.abs(b - a);
        System.out.println("After Swap: ");
        System.out.println("a: " + a + "\t b: " + b);
    }
}
