class Main{
    public static void main(String[] args){
        Shape square = new Square(10);
        Shape anotherSquare = square.clone();

        Shape rectangle = new Rectangle(10, 20);
        Shape anotherRectangle = rectangle.clone();

        Test test = new Test();

        List<Shape> shapes =
            Arrays.asList(square, rectangle,
                          anotherSquare, anotherRectangle);

        List<Shape> clonedShapes =
            test.cloneShapes(shapes);

        System.out.println(square == anotherSquare);
    }
}