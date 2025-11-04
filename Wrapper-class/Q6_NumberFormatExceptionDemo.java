public class Q6_NumberFormatExceptionDemo {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("12abc"); // invalid input
        } catch (NumberFormatException e) {
            System.out.println("Caught Exception: " + e);
        }
    }
}

