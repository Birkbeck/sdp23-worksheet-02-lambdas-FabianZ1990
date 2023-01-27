import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Outline {
  public static List<String> allMatches (List<String> l1,  Predicate<String> p1) {
    List<String> filteredList = l1
            .stream()
            .filter(p1)
            .collect(Collectors.toList());
    return filteredList;

  }

  public static <E> List<E> allMatchesForAllTypes (List<E> l1, Predicate<E> p1) {
    List<E> filteredList = l1
            .stream()
            .filter(p1)
            .collect(Collectors.toList());
    return filteredList;

  }


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

    System.out.println(allMatches(List.of(stringArray), s -> s.length() < 5));


    System.out.println(allMatchesForAllTypes(List.of(stringArray), s -> s.length() < 5));

    System.out.println(allMatchesForAllTypes(List.of(intArray), s -> s < 5));
  }
}
