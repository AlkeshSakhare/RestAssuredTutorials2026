package programs;

public class P_2_Palindrome {
    public static void main(String[] args) {

        int orno = 621515;
        int no = orno;
        int rev = 0;
        System.out.println("no: " + no);
        do {
            rev = (rev * 10) + no % 10;
            no = no / 10;
        } while (no > 0);

        System.out.println("rev: " + rev);
        if (orno == rev) {
            System.out.println("No is palimdrome");
        } else System.out.println("No is not palimdrome");
    }
}
