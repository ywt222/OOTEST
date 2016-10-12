class Circle implements Shape {
    private final double radius;

    Circle(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
