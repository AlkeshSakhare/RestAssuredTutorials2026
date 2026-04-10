package programs;

public class P_4_Fibonacci {
    public static void main(String[] args) {
        int firstNo = 0;
        int secondNo = 1;
        int sum = 0;
        System.out.print(firstNo + "\t");
        System.out.print(secondNo + "\t");
        for (int i = 0; i < 10; i++) {
            sum = firstNo + secondNo;
            System.out.print(sum + "\t");
            firstNo = secondNo;
            secondNo = sum;
        }
    }
}
