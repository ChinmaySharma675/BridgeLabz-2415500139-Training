public class Q5_IntegerComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b : " + (a == b));       // true (cached)
        System.out.println("c == d : " + (c == d));       // false (outside cache)
        System.out.println("a.equals(b): " + a.equals(b)); // true
        System.out.println("c.equals(d): " + c.equals(d)); // true
    }
}
