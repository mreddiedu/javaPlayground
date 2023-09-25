package oop_concepts.abstraction.InterfaceClassesExample.Shape;

public interface Shape {
  final static int instanceVariable = 99;
  // Calculate the area of the shape
  public abstract double getArea(); //notice 'public abstract' is grayed out.

  // Calculate the perimeter of the shape
  public abstract double getPerimeter();
}
