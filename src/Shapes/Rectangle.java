package Shapes;
//Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable
public class Rectangle extends Quadrilateral implements Measurable {
//constructor for rectangle
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
//set length and width/ void came automatically though intellij
    @Override
    void setLength(double length) {
    }
    @Override
    void setWidth(double width) {
    }

//    get perimeter and area as we did with the previous exercise
    @Override
    public double getPerimeter() {
        return ((2*length)+(2*width));
    }
    @Override
    public double getArea() {
        return (length * width);
    }
//    protected properties for both length and width
//    protected double length;
//    protected double width;
//
////    define a constructor that accepts two numbers for length and width, and sets those properties
//    public Rectangle (double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//    get area and perimeter
//    public double getArea() {
//        return this.length * this.width;
//    }
//    public double getPerimeter() {
//        return 2 * (this.length + this.width);
//    }
}
