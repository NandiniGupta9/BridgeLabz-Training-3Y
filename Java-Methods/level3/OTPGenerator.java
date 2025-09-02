import java.util.*;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i+1) + ": " + otps[i]);
        }

        System.out.println("Are all OTPs unique? " + areUnique(otps));
    }

    static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // 6-digit OTP
    }

    static boolean areUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        return set.size() == arr.length;
    }
}
