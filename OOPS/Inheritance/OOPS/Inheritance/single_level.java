package Inheritance;

import OOPS.polymorphosysm;

public class single_level {
    public static void main (String[] args) {
        Triangle t = new Triangle();
        t.color = "blue";
        System.out.println(t.color);
        Equilateral_triangle et = new Equilateral_triangle();
        et.area(10,10);
    }
}

class Shape {
    String color;
}

class Triangle extends Shape {
    public void area (int l, int h) {
        System.out.println("the area of the triangle is " + 0.5*l*h);
    }
}

class Circle extends Shape {
    public 
}

class Equilateral_triangle extends Triangle {

}