package oop_concepts.abstraction.AbstractClassesExample.Vehicle;

public class Airplane extends Vehicle {
  private int numberOfWheels = 2;

  @Override
  public void typicalAbstractMethodToBeAvoided() { // see Vehicle.java
    return;
  }

  @Override
  public void typicalAbstractMethod() {
    return;
  }
  @Override
  public void start() {
    System.out.println("Airplane engine started");
  }

  @Override
  public void stop() {
    System.out.println("Airplane engine stopped");
  }

  @Override
  public int getNumberOfWheels() {
    return this.numberOfWheels;
  }

}
