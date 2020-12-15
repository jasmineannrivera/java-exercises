package Shapes;

//Modify your ShapesTest class, use it to:
//
//declare a variable of the type Measurable named myShape.
//Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.

public class ShapesTest {
    public static void main(String[] args) {
        Quadrilateral myShape;
        myShape = new Rectangle(7, 11);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        System.out.println(myShape.getWidth());
    }
}
