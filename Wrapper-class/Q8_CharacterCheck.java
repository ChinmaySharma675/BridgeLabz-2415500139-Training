import java.util.ArrayList;

public class Q8_CharacterCheck {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('3');
        list.add('b');
        list.add('9');

        for (Character ch : list) {
            if (Character.isDigit(ch))
                System.out.println(ch + " is a Digit");
            else if (Character.isAlphabetic(ch))
                System.out.println(ch + " is an Alphabet");
            else
                System.out.println(ch + " is neither Digit nor Alphabet");
        }
    }
}
