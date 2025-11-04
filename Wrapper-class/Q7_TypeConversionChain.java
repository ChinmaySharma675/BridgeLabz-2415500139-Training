public class Q7_TypeConversionChain {
    public static void main(String[] args) {
        int num = 50;
        Integer obj = Integer.valueOf(num); // int → Integer
        String str = obj.toString();        // Integer → String
        Integer again = Integer.parseInt(str); // String → Integer

        System.out.println("int → Integer: " + obj);
        System.out.println("Integer → String: " + str);
        System.out.println("String → Integer: " + again);
    }
}
