import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get a valid SSN
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN is: " + ssn);

        // Get a valid UC M number
        String mNumber = SafeInput.getRegExString(in, "Enter your UC M number (format: MXXXXXXX)", "^M\\d{7}$");
        System.out.println("Your UC M number is: " + mNumber);

        // Get a valid menu choice
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O/S/V/Q)", "^[OoSsVvQq]$");
        System.out.println("Your menu choice is: " + menuChoice);
    }
}
