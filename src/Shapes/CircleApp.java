package Shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input in = new Input();
        Circle circ = new Circle(in.getDouble());
        System.out.println(circ.getArea());
//        System.out.println(circ.getRadius());
//        circ.setRadius(8.64);
//        System.out.println(circ.getCircumference());
//        System.out.println(circ.getRadius());
    }
}
