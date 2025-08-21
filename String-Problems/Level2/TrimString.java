import java.util.Scanner;

public class TrimString {

    public static int[] findBounds(String str) {
        int start = 0, end = str.length()-1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end+1}; // end is exclusive
    }

    public static String mySubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] bounds = findBounds(text);
        String userTrim = mySubstring(text, bounds[0], bounds[1]);
        String builtInTrim = text.trim();

        System.out.println("User Defined Trim: [" + userTrim + "]");
        System.out.println("Built-in Trim: [" + builtInTrim + "]");
        System.out.println("Comparison: " + compareStrings(userTrim, builtInTrim));
    }
}
