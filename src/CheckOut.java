import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;
        boolean moreItems = true;

        while (moreItems) {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 10.00);
            total += itemPrice;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
        }

        System.out.println("The total cost of the items is: $" + total);
    }
}
