package Shapes;



public class Square extends Rectangle {
    //Square should define a constructor that accepts one argument, side
    public Square(double side) {
//        Super references back to rectangle(PARENT) and the arguments inside dont have to be the same as the ones in rectangle
        super(side, side);
    }
    public double getArea(){
        System.out.println("Square Method used");
        double side = this.width;
        return side * side;
    }

    public double getPerimeter(){
        System.out.println("Square Method used");
        double side = this.width;
        return side * 4;
    }
}
