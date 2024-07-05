import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
        String nonZeroLenString = SafeInput.getNonZeroLenString(in, "Enter a non-zero length string");
        System.out.println("You entered: " + nonZeroLenString);

        // Test getInt
        int integer = SafeInput.getInt(in, "Enter an integer");
        System.out.println("You entered: " + integer);

        // Test getDouble
        double doubleValue = SafeInput.getDouble(in, "Enter a double");
        System.out.println("You entered: " + doubleValue);

        // Test getRangedInt
        int rangedInt = SafeInput.getRangedInt(in, "Enter a ranged integer", 1, 10);
        System.out.println("You entered: " + rangedInt);

        // Test getRangedDouble
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a ranged double", 1.0, 10.0);
        System.out.println("You entered: " + rangedDouble);

        // Test getYNConfirm
        boolean ynConfirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("You entered: " + (ynConfirm ? "Yes" : "No"));

        // Test getRegExString
        String regExString = SafeInput.getRegExString(in, "Enter a valid SSN (format: XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered: " + regExString);

        // Test prettyHeader
        SafeInput.prettyHeader("Hello, World!");
    }
}
