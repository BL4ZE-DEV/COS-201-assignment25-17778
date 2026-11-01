import java.util.Scanner;


public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the item name: ");
        String name = input.nextLine();

        System.out.print("Enter the unit price: ");
        double price = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        if (price < 0 || quantity < 0) {
            System.out.println("Error: price and quantity cannot be negative.");
            input.close();
            return;
        }

        double total = price * quantity;

        System.out.println();
        System.out.println("Item:       " + name);
        System.out.println("Unit price: " + price);
        System.out.println("Quantity:   " + quantity);
        System.out.println("Total cost: " + total);
        input.close();
    }
}