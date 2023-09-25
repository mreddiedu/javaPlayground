package oop_concepts.abstraction.AbstractClassesExample.Vehicle;

/**
 * "Is-a" Relationship: Both abstract classes and interfaces can be used.
 * "Can-do" or "Has-a" Relationship: Use interfaces (e.g., Runnable, Comparable).
 */
public abstract class Vehicle {
  private int numberOfWheels;


  public abstract void typicalAbstractMethodToBeAvoided();

  abstract void typicalAbstractMethod(); //this method is assumed to be public by Java compiler

  public void start() {
    System.out.println("Engine started");
  }
  void stop() {
    System.out.println("Engine stopped");
  }
  int getNumberOfWheels() {
    return this.numberOfWheels;
  }
}
