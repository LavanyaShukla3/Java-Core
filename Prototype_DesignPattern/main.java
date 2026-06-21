import java.util.*;

class main{
    public static void main(String[] args){
        Shape square = new Square(10); // 10 is the length
        Shape anotherSquare = square.clone(); // Clone with length 10

        Shape rectangle = new Rectangle(10, 20); // 10 is width, 20 is height
        Shape anotherRectangle = rectangle.clone(); // Clone with width 10 and height 20
        System.out.println(square == anotherSquare);
        System.out.println(rectangle == anotherRectangle);

    }
}