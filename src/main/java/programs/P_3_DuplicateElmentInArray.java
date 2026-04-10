package programs;

import java.util.HashSet;
import java.util.Set;

public class P_3_DuplicateElmentInArray {
    public static void main(String[] args) {
        int ip[] = {1, 58, 81, 1, 65, 96, 65, 1, 3};
        Set<Integer> no = new HashSet<>();
        for (int i = 0; i < ip.length; i++) {
            if (!no.add(ip[i])) {
                System.out.println("Duplicate Nos: " + ip[i]);
            }
        }
    }
}
