package programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P_7_LargeSmallFromArray {
    public static void main(String[] args) {
        Integer ip[] = {1, 58, 81, 1, 65, 96, 65, 1, 3};

        List<Integer> nos = Arrays.asList(ip);

        nos = nos.stream().sorted(Comparator.naturalOrder()).toList();

        System.out.println("Smallest No:" + nos.get(0));
        System.out.println("Largest No:" + nos.get(nos.size() - 1));
    }
}
