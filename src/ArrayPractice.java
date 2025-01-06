public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] newArray = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    newArray[0] = "Hello";
    newArray[1] = "My";
    newArray[2] = "Name's";
    newArray[3] = "Tav";

    // Get the value of the array at index 2
    System.out.println(newArray[2]);
    // Get the length of the array
    System.out.println("The length of the array is: " + newArray.length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < newArray.length; i++) {
      System.out.println(newArray[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    // Breaking to show for each
    System.out.println();
    for (String words:newArray) {
      System.out.println(words);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
