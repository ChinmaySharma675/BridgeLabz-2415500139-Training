public class Q4_StringToDoubleIntValue {
    public static void main(String[] args) {
        String str = "45.67";
        Double d = Double.parseDouble(str);
        System.out.println("Double value: " + d);
        System.out.println("Integer value: " + d.intValue());
    }
}
