package fundamentals;
import java.util.HashSet;
import java.util.Set;

public class CollectionsHs {
  public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
      
    System.out.println(numbers.size());

    for( Integer elements: numbers) {
      System.out.println(elements);
    }


    System.out.println(numbers.contains(3));

  }
}
