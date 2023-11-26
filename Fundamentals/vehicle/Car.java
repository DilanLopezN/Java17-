package vehicle;

public class Car  extends Engine implements Vehicle    {
  private double velocity;
  public void setVelocity(double velocity) {
    this.velocity = velocity;
  }
  public double getVelocity() {
    return velocity;
  }

  void start() {
    this.velocity = 5;
  }

  @Override
  public void accelerate() {
    setSpeed(5);
    velocity = velocity + getSpeed();
  }

  @Override
  public void brake() {
    setSpeed(3);
    velocity = velocity - getSpeed();

    if(velocity <= 0) {
      velocity = 0;
      System.out.println("Car stopped");
    }
    
  }
  
}
