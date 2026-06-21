class Rectangle implements Shape{
    int length;
    int width;

    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;

    }
    @Override
    public Shape clone() {
        return new Rectangle(length, width);
    }

}