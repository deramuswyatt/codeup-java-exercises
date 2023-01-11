package Shapes;

public class Rectangle {
//    protected properties for both length and width
    protected double length;
    protected double width;

//    define a constructor that accepts two numbers for length and width, and sets those properties
    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return this.length * this.width;
    }
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
