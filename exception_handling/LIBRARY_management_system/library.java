import java.util.*;
class BookNotAvailableException extends Exception {}
class LimitExceededException extends Exception {}
public class library {
    static String[] books = {"A","B","C"};
    static int[] copies = {2, 2, 2};
    static int borrowed = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Book to borrow:");
            String b = sc.nextLine();
            try {
                borrow(b);
                System.out.println("borrowed the book " + b);
            } catch (BookNotAvailableException e) {
                System.out.println("book not available");
            } catch (LimitExceededException e) {
                System.out.println("limit exceeded");
                break;

            } finally {
                System.out.println("Transaction completed");
            }
        }
    }
    static void borrow(String b) throws BookNotAvailableException,LimitExceededException {
        if (borrowed >= 3) throw new LimitExceededException();
        for (int i = 0;i < books.length;i++) {
            if (books[i].equalsIgnoreCase(b) && copies[i] > 0) {
                copies[i]--; borrowed++;
                return;
            }
        }
        throw new BookNotAvailableException();
    }
}