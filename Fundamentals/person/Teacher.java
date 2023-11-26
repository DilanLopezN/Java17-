package person;

/**
 * Teacher
 */
public class Teacher extends Person {
  private double wage;
  public void setWage(double wage) {
    this.wage = wage;
  }
  public double getWage() {
    return wage;
  }

   String printPersonName() {
   System.out.println(super.printPersonName());
    return "Name:  "  + getName() + " " + "Wage R$" + wage;
  }
  
}