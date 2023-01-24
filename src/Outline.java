import java.util.Arrays;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]
    Integer[] intArray = {1,7,3,4,8,2};
    String[]  stringArray = {"apple", "kiwi", "passionfruit", "banana", "peach", "apricot", "pineapple" };

    System.out.println(Arrays.asList(intArray));
    System.out.println(Arrays.asList(stringArray));
    // Arrays.sort(intArray,.......)
  } 
}
