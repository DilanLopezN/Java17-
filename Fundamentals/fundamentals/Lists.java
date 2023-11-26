package fundamentals;
import java.util.ArrayList;
import java.util.List;

/**
 * Lists
 */
public class Lists {

  public static void main(String[] args) {
    List<String> names =  new ArrayList<>();
    names.add("Dilan");
    names.add("Lopez");

    for(String name : names) {
      System.out.println("With for" + name);
    }

    // Lambda

    names.forEach(name -> System.out.println("With lamda" + name));

  

  }


  
}