package oop_concepts.abstraction.AbstractClassesExample;

import oop_concepts.abstraction.AbstractClassesExample.Vehicle.Airplane;

class main {
  public static void main(String args[]) {
    Airplane airplane = new Airplane();
    airplane.start();
    System.out.println("Number of wheels: " + airplane.getNumberOfWheels());
  }
}
