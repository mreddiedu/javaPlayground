package oop_concepts.abstraction.InterfaceClassesExample.Shape;

public class Circle implements Shape{
  public int instanceVariable;
  double radius;

  public Circle (double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return 3.14 * Math.pow(radius, 2);
  }

  @Override
  public double getPerimeter() {
    return 2 * 3.14 * radius;
  }

  @Override
  public String toString() {
    return new String("circle");
  }
}
