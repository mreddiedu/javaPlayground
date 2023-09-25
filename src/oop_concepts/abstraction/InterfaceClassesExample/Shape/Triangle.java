package oop_concepts.abstraction.InterfaceClassesExample.Shape;

public class Triangle implements Shape {

  @Override
  public double getArea() {
    return 0;
  }

  @Override
  public double getPerimeter() {
    return 0;
  }

  public void aMethodSpecificToTriangle() {
    System.out.println("aMethodSpecificToTriangle");
  }
}
