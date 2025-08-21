import java.util.*;

public class SplitStringCompare {

    public static int myLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] mySplit(String str) {
        int len = myLength(str);
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                if (!word.equals("")) {
                    words.add(word);
                    word = "";
                }
            } else {
                word += c;
            }
        }
        if (!word.equals("")) words.add(word);
        return words.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] userSplit = mySplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("User Split: " + Arrays.toString(userSplit));
        System.out.println("Built-in Split: " + Arrays.toString(builtIn));
        System.out.println("Comparison: " + compareArrays(userSplit, builtIn));
    }
}
