import java.util.ArrayList;

public class Q3_AddPrimitiveToCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Works due to autoboxing
        list.add(10);  // int → Integer
        list.add(20);

        System.out.println("List elements: " + list);
    }
}
