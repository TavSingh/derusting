import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "Fives";
    // Find the length of the string
    System.out.println(word.length());
    // Concatenate (add) two strings together and reassign the result
    word += " high?";
    System.out.println(word);
    // Find the value of the character at index 3
    System.out.println(word.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    if (word.contains("high")) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
    // Iterate over the characters of the string, printing each one on a separate line
    for (Character letter : word.toCharArray()) {
        System.out.println(letter);
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> newList = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    newList.add("Apple");
    newList.add("bottom");
    newList.add("jeans");
    newList.add("boots");
    newList.add("with the?");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String lyric = String.join(", ", newList);
    System.out.println(lyric);
    // Check whether two strings are equal
    if (lyric.equals(word)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
