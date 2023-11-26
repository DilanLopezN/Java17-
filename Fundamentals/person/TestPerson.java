package person;

public class TestPerson {
  public static void main(String[] args) {
    
    Teacher professor1 = new Teacher();

    professor1.setAge(23);
    professor1.setCpf("44466699925");
    professor1.setName("Dilan");
    professor1.setWage(3500);
    System.out.println(professor1.printPersonName());

  
    Student student1 = new Student();
    student1.setAge(14);
    student1.setCpf("23423423542");
    student1.setName("Maria");
    student1.setRegistration("45541");




  }
}
