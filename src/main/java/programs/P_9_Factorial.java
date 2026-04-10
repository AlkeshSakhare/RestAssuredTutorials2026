package programs;

public class P_9_Factorial {
    public static void main(String[] args) {
        int no = -3;
        int fact = 1;
        if (no == 0 || no == 1) {
            System.out.println(no + "! =" + fact);
        } else if (no < 0) {
            System.out.println("factorial is not defined for negative integers.");
        } else {
            for (int i = no; i > 1; i--) {
                fact = fact * i;
            }
            System.out.println(no + "! =" + fact);
        }
    }
}
