package creational.prototype.shape;

public class Circle implements Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super();
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
    @Override
    public double area() {
        return 2*Math.PI*radius;
    }

    @Override
    public String properties() {
        return String.format("Radius: %s, Area: %.2f",radius,area());
    }

}
