package programs;

import java.util.LinkedHashSet;

public class P_11_RemoveDupCharFromString {
    public static void main(String[] args) {
        String ip = "removeduplicatechar";
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < ip.length(); i++) {
            if (!linkedHashSet.add(ip.charAt(i))) {
                System.out.print(ip.charAt(i) + "\t");
            }
        }
    }
}
