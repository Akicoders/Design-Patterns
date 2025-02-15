package utp.edu.pe.Creacionales.Prototype;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       ArrayList<Shape> shapes = new ArrayList<>();
       Circle circle = new Circle();
       circle.x = 10;
       circle.y = 20;
       circle.color = "red";
       circle.radius = 100;

       shapes.add(circle);
       Circle circle2 = (Circle) circle.copy();
       shapes.add(circle2);

       Rectangle rectangle = new Rectangle();
       rectangle.x = 10;
       rectangle.y = 20;
       circle.color = "blue";
       rectangle.width = 100;
       rectangle.height = 200;

       shapes.add(rectangle);

       for (Shape shape : shapes) {
           System.out.println(shape.toString());
       }


    }
}
