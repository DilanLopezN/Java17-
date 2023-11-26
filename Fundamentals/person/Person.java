package person;

public class Person {
  private String name;
  private int age;
  private String cpf;

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return age;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public String getCpf() {
    return cpf;
  }

  String printPersonName() {
    return "Name: "  + name;
  }

}
