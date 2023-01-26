import java.util.Arrays;
import java.util.Comparator;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]


    Integer[] intArray = {1,7,3,4,8,2};
    String[]  stringArray = {"apple", "kiwi", "passionfruit", "eggfruit", "banana", "peach", "apricot", "pineapple", "elderberry" };



    Comparator<String> shortestToLongest = (String a, String b) -> a.length() - b.length();
    Comparator<String> longestToShortest = (String a, String b) -> b.length() - a.length();
    Comparator<String> firstCharacter = (String a, String b) -> a.charAt(0) - b.charAt(0);

    Comparator<String> firstCharacterE = (o1, o2) -> {

      if (o1.contains("e") && !o2.contains("e")) {
        return -1;
      } else if (!o1.contains("e") && o2.contains("e")) {
        return 1;
      } else {
        return 0;
      }
    };

    System.out.println(Arrays.asList(intArray));
    System.out.println(Arrays.asList(stringArray));

    Arrays.sort(stringArray, shortestToLongest);
    System.out.println(Arrays.asList(stringArray));

    Arrays.sort(stringArray, longestToShortest);
    System.out.println(Arrays.asList(stringArray));

    Arrays.sort(stringArray, firstCharacter);
    System.out.println(Arrays.asList(stringArray));

    Arrays.sort(stringArray, firstCharacterE);
    System.out.println(Arrays.asList(stringArray));

  }
}
