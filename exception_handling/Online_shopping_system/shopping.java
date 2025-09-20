import java.util.*;
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String msg) { super(msg); }
}
class LimitExceededException extends Exception {
    public LimitExceededException(String msg) { super(msg); }
}
public class shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter item price: ");
        double itemPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        double totalPrice = itemPrice * quantity;
        try {
            if (quantity <= 0) throw new InvalidQuantityException("Invalid quantity");
            if (totalPrice > 50000) throw new LimitExceededException("Order amount is exceeding ");
            System.out.println("Order confirmed");
            System.out.println("Item: " + itemName);
            System.out.println("Total Price: " + totalPrice);
        } 
        catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        } 
        catch (LimitExceededException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("thank you for shopping with us");
        }
    }
}