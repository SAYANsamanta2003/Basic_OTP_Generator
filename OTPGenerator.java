import java.util.Scanner;
import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int generatorOtp = random.nextInt(100000); // Generates a random OTP between 0 and 99999
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.println("Hello...! " + username);
        System.out.println("It is your OTP: " + generatorOtp);

        System.out.print("Enter the OTP for login: ");
        String password = scanner.nextLine();

        if (password.equals(String.valueOf(generatorOtp))) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login unsuccessful");
        }

        scanner.close();
    }
}
