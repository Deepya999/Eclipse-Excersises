package com;
class Polygon {

  // method to render a shape
  public void make() {
    System.out.println("making Polygon...");
  }
}

class Square extends Polygon {

  // renders Square
  public void make() {
    System.out.println("making Square...");
  }
}

class Circle extends Polygon {

  // renders circle
  public void make() {
    System.out.println("making Circle...");
  }
}

class Main {
  public static void main(String[] args) {
    
    // create an object of Square
    Square s1 = new Square();
    s1.make();

    // create an object of Circle
    Circle c1 = new Circle();
    c1.make();
  }
}