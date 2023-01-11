package Shapes;
//create an abstract Quadrilateral class that extends Shape and implements Measurable
abstract class Quadrilateral extends Shape implements Measurable {
//    protected properties for length and width.

    protected double length;
    protected double width;

//    without this the error i get in other tabs == There is no default constructor available in 'Shapes.Quadrilateral'
    public Quadrilateral() {
        this.length = length;
        this.width = width;
    }
//    a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral (double length, double width){
        this.length = length;
        this.width = width;
    }
//    methods for getting the length and width.
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
//    abstract methods for setting the length and width.

    abstract void setLength(double length);
    abstract void setWidth(double width);
}
