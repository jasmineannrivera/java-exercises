package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        //create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        Rectangle box2 = new Square(5);

        //verify that the getPerimeter and getArea methods return 20 and 25, respectively.

        System.out.println(box2.getPerimeter());
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
    }
}
