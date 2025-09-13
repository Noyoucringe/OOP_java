public class array_store {
    public static void main(String[] args) {
        try {
            Object x[] = new String[3];
            x[0] = Integer.valueOf(10);
        } catch (ArrayStoreException e) {
            System.out.println("Array Store Exception");
        }
    }
}
