package utp.edu.pe.Creacionales.Prototype;

 abstract class Shape {
    int x;
    int y;
    String color;

     public Shape() {
     }

     public Shape(int x, int y, String color) {
         this.x = x;
         this.y = y;
         this.color = color;
     }

     public Shape(Shape shape) {
         this();
         this.x = shape.x;
         this.y = shape.y;
         this.color = shape.color;
     }

    abstract Shape copy();

     @Override
     public String toString() {
         return Integer.toHexString(System.identityHashCode(this))+
                 "Shape{" +
                 "x=" + x +
                 ", y=" + y +
                 ", color='" + color + '\'' +
                 '}';
     }
 }
