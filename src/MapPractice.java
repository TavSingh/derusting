import java.util.HashMap;
import java.util.Map;


public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> newMap = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    newMap.put("For", 1);
    newMap.put("Gas", 2);
    newMap.put("Port", 3);


    // Get the value associated with a given key in the Map
    System.out.println(newMap.get("Port"));
    // Find the size (number of key/value pairs) of the Map
    System.out.println(newMap.size());
    // Replace the value associated with a given key (the size of the Map should not change)
    newMap.replace("For", 9);
    // Check whether the Map contains a given key
    System.out.println(newMap.containsKey("Port"));
    // Check whether the Map contains a given value
    System.out.println(newMap.containsValue(4));
    // Iterate over the keys of the Map, printing each key
    System.out.println("Keys:");
    for (String keys : newMap.keySet()) {
      System.out.println(keys);
    }
    // Iterate over the values of the map, printing each value
    System.out.println("Values:");
    for (Integer values : newMap.values()) {
      System.out.println(values);
    }
    // Iterate over the entries in the map, printing each key and value
    System.out.println("Both Keys and Values");
    for (Map.Entry<String, Integer> set : newMap.entrySet()) {
        System.out.println("Keys: " + set.getKey() + ", Values: " + set.getValue());
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
