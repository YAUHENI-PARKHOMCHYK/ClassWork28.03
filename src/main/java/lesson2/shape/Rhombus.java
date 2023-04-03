package lesson2.shape;

public class Rhombus extends Figure{

        private double sideLength;
        private double corner;
        private double radians;
        public Rhombus(double sideLength, double corner) {
            this.sideLength = sideLength;
            this.corner = corner;
            this.radians = Math.toRadians(corner);
        }
        @Override
        double area() {

            return (sideLength*sideLength)*Math.sin(radians);
        }
        @Override
        double perimeter() {

            return sideLength*4;
        }

}
