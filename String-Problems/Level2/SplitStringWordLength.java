import java.util.*;

public class SplitStringWordLength {

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

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(myLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] words = mySplit(text);
        String[][] wordLengths = wordWithLength(words);

        System.out.println("Word\tLength");
        for (String[] wl : wordLengths) {
            System.out.println(wl[0] + "\t" + Integer.parseInt(wl[1]));
        }
    }
}
