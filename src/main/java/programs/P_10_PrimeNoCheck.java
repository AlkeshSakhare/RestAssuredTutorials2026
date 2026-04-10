package programs;

import java.util.Scanner;

public class P_10_PrimeNoCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        boolean isPrime = true;
        if (no <= 1) {
            System.out.println("its not Prime no");
        }
        if (no >= 2) {
            for (int i = 2; i <= no / 2; i++) {
                if (no % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println("No is prime: " + isPrime);
        }
    }
}
