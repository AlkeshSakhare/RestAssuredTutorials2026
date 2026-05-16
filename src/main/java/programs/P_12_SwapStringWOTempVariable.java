package programs;

public class P_12_SwapStringWOTempVariable {
    public static void main(String[] args) {
        String a = "Poonam Das";//9
        String b = "Ranjan Dassss";//12
        System.out.println("Before Swap: ");
        System.out.println("a: " + a + "\t b: " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
//        b = a.replace(b, "");
//        a = a.replace(b, "");
        System.out.println("After Swap: ");
        System.out.println("a: " + a + "\t b: " + b);
    }
}
