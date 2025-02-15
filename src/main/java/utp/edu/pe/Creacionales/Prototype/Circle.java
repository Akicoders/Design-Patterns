package utp.edu.pe.Creacionales.Prototype;

import java.util.List;

public class Circle extends Shape  {
    int radius;
    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    Shape copy() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return   "Circle{" +
                "id=" + Integer.toHexString(System.identityHashCode(this))  +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
