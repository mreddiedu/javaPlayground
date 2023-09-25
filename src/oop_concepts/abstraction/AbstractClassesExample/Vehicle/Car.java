package oop_concepts.abstraction.AbstractClassesExample.Vehicle;

public class Car extends Vehicle {
  @Override
  public void typicalAbstractMethodToBeAvoided() { // see Vehicle.java
    return;
  }

  @Override
  public void typicalAbstractMethod() {
    return;
  }
}
