package Shapes;

public class ShapesTest {
    public static void main(String[] args) {

//        create a variable of the type Rectangle named box1 and assign it
//        a new instance of the Rectangle class with a width of 4 and a length of 5
//        Rectangle box1 = new Rectangle();
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        Rectangle box2 = new Rectangle();
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

//        modified shapestest replacing RECTANGLE with MEASURABLE(DECLARING THE VARIABLE TYPE)
        Measurable myShape = new Rectangle(5,4);
        System.out.println("Perimeter for rectangle: " + myShape.getPerimeter());
        System.out.println("Area for rectangle: " + myShape.getArea());
//        modified shapestest replacing RECTANGLE with MEASURABLE(DECLARING THE VARIABLE TYPE)
        Measurable myShape2 = new Square(5);
        System.out.println("Perimeter for square: " + myShape2.getPerimeter());
        System.out.println("Area for square: " + myShape2.getArea());

    }
}
