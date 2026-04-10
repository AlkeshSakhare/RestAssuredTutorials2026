package programs;

public class P_1_ReversePreserveSpace {
    public static void main(String[] args) {
        String ip = "Alkesh Sakhare";
        // Remove spaces and reverse
        String reversed = new StringBuilder(ip.replaceAll(" ", ""))
                .reverse()
                .toString();
        StringBuilder op = new StringBuilder();
        int j = 0; // pointer for reversed string

        for (int i = 0; i < ip.length(); i++) {
            if (ip.charAt(i) == ' ') {
                op.append(' ');
            } else {
                op.append(reversed.charAt(j++));
            }
        }
        System.out.println("ip: " + ip);
        System.out.println("op: " + op.toString());

    }
}
