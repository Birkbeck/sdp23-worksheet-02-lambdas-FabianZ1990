import java.util.Comparator;
import java.util.function.BiFunction;

public class betterString {
public static String betterString (String s1, String s2, Comparator<String> comparator) {
 if (s1.compareTo(s2) == 1) {return s1;}
 else return s2;

}


    public static void main(String[] args) {

        System.out.println(betterString("123","1234", (s1, s2) -> s1.length() > s2.length()));
    }

}
