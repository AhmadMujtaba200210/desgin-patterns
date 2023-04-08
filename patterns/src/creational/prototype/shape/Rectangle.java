package creational.prototype.shape;

public class Rectangle implements Shape {
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super();
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone(){
        return new Rectangle(this);
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public String properties() {
        return String.format("Height: %s, Width: %s, Area: %.2f",height,width,area());
    }

}