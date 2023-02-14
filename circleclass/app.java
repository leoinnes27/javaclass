public class app {
    public static void main(String[] args) {
        // Create a Circle
        circle circle = new circle(5);
        // Use the methods
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Parameter: " + circle.getParameter());

        // Create a Cylinder
        cylinder cylinder = new cylinder(10, 3);
        // Use the method
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
    }
}
