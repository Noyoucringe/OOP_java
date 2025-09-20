import java.util.*;
class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) { 
        super(msg); 
    }
}
public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks:");
        int marks = sc.nextInt();
        try {
            checkMarks(marks);

            if (marks >= 90) System.out.println("Grade A");
            else if (marks >= 75) System.out.println("Grade B");
            else if (marks >= 50) System.out.println("Grade C");
            else System.out.println("FAIL");
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("result processed");
        }
    }
    static void checkMarks(int m) throws InvalidMarksException {
        if (m < 0 || m > 100) throw new InvalidMarksException("Invalid");
    } 
}