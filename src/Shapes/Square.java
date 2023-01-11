package Shapes;
//Change your existing Square class to extend Quadrilateral.
public class Square extends Quadrilateral {
    Square(double side){
        setLength(side);
    }

//    ?constructor for setting length and width
    @Override
    void setLength(double length) {
        this.length = length;
        this.width = length;
    }
    @Override
    void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
//Get perimeter and area agin for the square
    @Override
    public double getPerimeter() {
        return (4 * length);
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
    //Square should define a constructor that accepts one argument, side
//    public Square(double side) {
////        Super references back to rectangle(PARENT) and the arguments inside dont have to be the same as the ones in rectangle
//        super(side, side);
//    }
//    public double getArea(){
//        System.out.println("Square Method used");
//        double side = this.width;
//        return side * side;
//    }
//
//    public double getPerimeter(){
//        System.out.println("Square Method used");
//        double side = this.width;
//        return side * 4;
//    }

