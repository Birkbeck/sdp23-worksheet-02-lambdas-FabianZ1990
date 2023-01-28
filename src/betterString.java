import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class betterString implements TwoStringPredicate {

    public static BiPredicate betterString(String s1, String s2) {
        return (a1, a2) -> s1.length() > s2.length();
        }


    public static void main(String[] args) {
        System.out.println(betterString("test1234", "test"));
    }

}

