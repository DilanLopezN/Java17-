package person;

public class TestPerson {
  public static void main(String[] args) {
    
    Person person = new Person();

    person.age = 23;
    person.cpf = "44466699925";
    person.name = "Dilan";

    System.out.println( person.printPersonName());

  }
}
