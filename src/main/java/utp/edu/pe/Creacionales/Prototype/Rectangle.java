package utp.edu.pe.Creacionales.Prototype;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle() {

    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    Shape copy() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return   "Rectangle{" +
                "id=" + Integer.toHexString(System.identityHashCode(this))  +
                ", x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
