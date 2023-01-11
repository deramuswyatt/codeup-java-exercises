package Shapes;

public class ShapesTest {
    public static void main(String[] args) {

//        create a variable of the type Rectangle named box1 and assign it
//        a new instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(4,5);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());
        Rectangle box2 = new Square(5);
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());


    }
}
