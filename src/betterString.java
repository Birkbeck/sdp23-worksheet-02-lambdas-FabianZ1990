public class betterString {

    public static String betterString(String s1, String s2, BetterStringOfTheTwo lambda) {
        if (lambda.test(s1, s2)) {
            return s1;
        }
        else return s2;
    }


    public static void main(String[] args) {

        System.out.println(betterString("test12", "test2", (s1, s2) -> s1.length() > s2.length()));
        System.out.println(betterString("test1", "test2", (s1, s2) -> true));
        System.out.println(betterString("test1", "test2", (s1, s2) -> false));
    }
}


