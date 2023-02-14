public class circle {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getParameter() {
        return 2 * Math.PI * radius;
    }
}

