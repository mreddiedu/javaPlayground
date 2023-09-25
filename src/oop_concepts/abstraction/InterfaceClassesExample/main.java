package oop_concepts.abstraction.InterfaceClassesExample;

import oop_concepts.abstraction.InterfaceClassesExample.Shape.Circle;
import oop_concepts.abstraction.InterfaceClassesExample.Shape.Rectangle;

class main {
  public static void main(String args[]) {
    Circle circle = new Circle(10);
    Rectangle rectangle = new Rectangle(5, 10);

    System.out.println(String.format("%s area: %s perimeter: %s",
      circle.toString(), circle.getArea(), circle.getPerimeter()));

    System.out.println(String.format("%s area: %s perimeter: %s",
      rectangle.toString(), rectangle.getArea(), rectangle.getPerimeter()));

    System.out.println();
  }
}
