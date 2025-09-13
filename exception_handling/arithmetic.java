public class arithmetic {
    public static void main(String[] args) {
        int a = 30, b = 0;
        try {
            int c = a/b;
        }
catch (ArithmeticException e){
    System.out.println("Denominator should not be divided by zero");
}
    }
}