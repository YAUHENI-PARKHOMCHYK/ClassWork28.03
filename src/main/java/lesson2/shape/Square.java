package lesson2.shape;

public class Square extends Figure {
private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    double area() {

        return sideLength*sideLength;
    }
    @Override
    double perimeter() {

        return sideLength*4;
    }
}
