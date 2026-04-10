package programs;

import java.util.Locale;

public class P_8_VowelsConsconentsCount {
    public static void main(String[] args) {
        String ip = "Count me";
        int vowels = 0;
        int consonents = 0;
        ip = ip.toLowerCase(Locale.ROOT);
        ip = ip.replaceAll("[^a-zA-Z]+", "");
        System.out.println(ip);
        for (int i = 0; i < ip.length(); i++) {
            switch (ip.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    consonents++;
                default:
                    vowels++;
            }
        }
        System.out.println("consonents: " + consonents);
        System.out.println("vowels: " + vowels);
    }
}
