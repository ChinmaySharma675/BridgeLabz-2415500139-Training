import java.util.ArrayList;

public class Q1_ArrayListPrimitive {
    public static void main(String[] args) {
        // ❌ Not allowed:
        // ArrayList<int> list = new ArrayList<int>(); // Error: int is not a reference type

        // ✅ Allowed:
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);  // Autoboxing: int → Integer
        list.add(20);

        System.out.println("ArrayList of Integers: " + list);
    }
}
