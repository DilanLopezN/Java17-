package vehicle;

public class TestVehicle {
  public static void main(String[] args) {
    Motorcycle intruder125 = new Motorcycle();
    intruder125.start();
    System.out.println(intruder125.getVelocity());
    intruder125.accelerate();
    System.out.println(intruder125.getVelocity());
    intruder125.brake();
    System.out.println(intruder125.getVelocity());
    intruder125.brake();
    System.out.println(intruder125.getVelocity());
    intruder125.brake();
    System.out.println(intruder125.getVelocity());
    intruder125.brake();
    System.out.println(intruder125.getVelocity());
  }
}
