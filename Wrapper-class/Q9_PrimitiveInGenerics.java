import java.util.ArrayList;

public class Q9_PrimitiveInGenerics {
    public static void main(String[] args) {
        // ❌ Not allowed:
        // ArrayList<int> list = new ArrayList<int>(); // Compile error

        // ✅ Correct:
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        System.out.println("Valid Generic List: " + list);
    }
}
