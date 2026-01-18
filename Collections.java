import java.util.HashMap;
import java.util.Map;

public class Collections {
  public static void map() {
    Map<Integer, String> map = new HashMap<>();

    map.put(1, "one");
    map.put(2, "two");
    map.put(3, "three");

    map.forEach((key, value) -> {
      System.out.println(key + ": " + value);
    });
  }
}