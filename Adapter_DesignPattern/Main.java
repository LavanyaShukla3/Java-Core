class SquareHole {
    private double sideLength;

    public SquareHole(double sideLength) {
        this.sideLength = sideLength;
    }

    public boolean canFit(Square square) {
        return this.sideLength >= square.getSideLength();
    }
}

class Square {
    private double sideLength; 

    public Square() {}

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    public double getSideLength() {
        return sideLength;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}
class CircleToSquareAdapter extends Square {
    private Circle circle;

    public CircleToSquareAdapter(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double getSideLength() {
        return 2 * circle.getRadius();
    }
}
public class Main{
    public static void main(String[] args){
        SquareHole squareHole = new SquareHole(5);

        Square square = new Square(5);
        System.out.println(squareHole.canFit(square));            // true

        Circle circle = new Circle(5);
        CircleToSquareAdapter circleAdapter = new CircleToSquareAdapter(circle);
        System.out.println(squareHole.canFit(circleAdapter));
    }
}