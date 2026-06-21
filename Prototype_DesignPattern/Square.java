class Square implements Shape{
    int length;

    public Square(int length) {
        this.length = length;
    }
    @Override
    public Shape clone() {
        return new Square(length);
    }

}