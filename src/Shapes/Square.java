package Shapes;

//Change your existing Square class to extend Quadrilateral.
//
//Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.

public class Square extends Quadrilateral {
    public Square(double side) {
        super();
        this.length = side;
        this.width = side;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public void setWidth(double width) {
        this.setSide(length);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

}
