import java.util.Scanner;

public class VowelConsonantType {

    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32); // convert uppercase to lowercase

        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] analyze(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = charType(text.charAt(i));
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Character\tType");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = analyze(text);
        display(result);
    }
}
