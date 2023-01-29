import javax.lang.model.element.Element;

public class betterElement {

    public static Object betterElement(Object s1, Object s2, BetterElementOfTheTwo lambda) {
        if (lambda.test(s1, s2)) {
            return s1;
        }
        else return s2;
    }


    public static void main(String[] args) {

        System.out.println(betterElement("test12", "test2", (s1, s2) -> s1.length() > s2.length()));
        System.out.println(betterElement("test1", "test2", (s1, s2) -> true));
        System.out.println(betterElement("test1", "test2", (s1, s2) -> false));
    }
}


