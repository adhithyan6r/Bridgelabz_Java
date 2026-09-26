package javaMethods.Level3;
import java.util.Arrays;
// Problem: Generate six-digit OTP numbers 10 times and check whether all generated OTPs are unique.
public class OtpGenerator {
    // Method: Generate a six-digit OTP.
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }
    // Method: Check whether all OTP numbers are unique.
    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Input: Generate 10 six-digit OTP numbers.
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }
        System.out.println("OTPs: " + Arrays.toString(otps));
        System.out.println("All OTPs are unique: " + areUnique(otps));
    }
}