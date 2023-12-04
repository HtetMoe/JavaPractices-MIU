package question19;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        char[] a1 = {'o', 'o', 'b'};//{'s', 'i', 't' };
        char[] a2 = {'b', 'o', 'o'}; //{'i', 't', 's' };
        System.out.println("result : " + areAnagrams(a1, a2, a2.length));
    }

    public static int areAnagrams(char[] a1, char[] a2, int len) {
        if (a1.length != a2.length) return 0;

        //sort strings
        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println("s1 " + Arrays.toString(a1));
        System.out.println("s2 " + Arrays.toString(a2));

        return Arrays.equals(a1, a2) ? 1 : 0;
    }
}
