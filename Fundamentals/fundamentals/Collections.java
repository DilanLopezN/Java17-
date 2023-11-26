package fundamentals;
import java.util.HashMap;
import java.util.Map;

public class Collections {
  public static void main(String[] args) {


    Map<String, Integer> notes = new HashMap<>();

    notes.put("N1", 10);
    notes.put("N2", 7);

    if((notes.get("N1") + notes.get("N2")) / 2 <= 6 ) {
      System.out.println("Reprovado");
    } else {
      System.out.println("Aprovado");
    }


    for ( Map.Entry<String, Integer> entry : notes.entrySet()){
        System.out.println(entry.getValue());
    }
  }
}
