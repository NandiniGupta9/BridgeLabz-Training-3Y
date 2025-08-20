import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i]);
            age[i] = sc.nextInt();
            System.out.println("Enter height of " + names[i]);
            height[i] = sc.nextInt();
        }

        int youngest = 0, tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) youngest = i;
            if (height[i] > height[tallest]) tallest = i;
        }

        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
    }
}
