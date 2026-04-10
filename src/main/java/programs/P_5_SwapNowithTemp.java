package programs;

public class P_5_SwapNowithTemp {

    public static void main(String[] args) {
        int a = 11;
        int b = 22;

        System.out.println("Before Swap: ");
        System.out.println("a: " + a + "\t b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: ");
        System.out.println("a: " + a + "\t b: " + b);
    }

    public static void swap(int a, int b) {

    }
}
