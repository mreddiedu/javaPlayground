package oop_concepts.abstraction.InterfaceClassesExample.Shape;

public class Rectangle implements Shape{
  double width, length;

  public Rectangle(int width, int length) {
    this.width = width;
    this.length = length;
  }


  @Override
  public double getArea() {
    return this.width * this.length;
  }

  @Override
  public double getPerimeter() {
    return (width + length) * 2;
  }

  @Override
  public String toString() {
    return new String("rectangle");
  }
}
