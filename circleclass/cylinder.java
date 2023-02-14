public class cylinder {
    private double height;
    private circle base;

    public cylinder(double height, double radius) {
        this.height = height;
        this.base = new circle(radius);
    }

    public double getVolume() {
        return base.getArea() * height;
    }
}

