class Rectangle implements Shape {
    private final double length;
    private final double width;

    Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException();
        }
        this.length = length;
        this.width = width;
    }

    static Rectangle setSquare(double side) {
        return new Rectangle(side, side);
    }

    public double area() {
        return this.width * this.length;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}
