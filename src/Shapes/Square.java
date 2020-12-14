package Shapes;

//Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
public class Square extends Rectangle {

    public Square(int side) {
        this.length = side;
        this.width = side;
    }
    //In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
    @Override
    public int getArea() {
        System.out.println("overridden method");
        return this.length * this.length;
    }

    @Override
    public int getPerimeter(){
        System.out.println("overridden method");
        return 4 * this.length;
    }



}
