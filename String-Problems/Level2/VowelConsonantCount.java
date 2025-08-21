import java.util.Scanner;

public class VowelConsonantCount {

    public static boolean isVowel(char c) {
        c = (char)(c >= 'A' && c <= 'Z' ? c + 32 : c); // convert to lowercase
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }

    public static int[] countVC(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) {
                if (isVowel(ch)) v++; else c++;
            }
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] res = countVC(text);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }
}
