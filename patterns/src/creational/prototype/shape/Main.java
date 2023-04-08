package creational.prototype.shape;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Circle
        Circle circle = new Circle();
        circle.radius=4;
        System.out.printf("Area of Circle:%.2f%n",circle.area());
        System.out.println(circle.properties());

        Circle anotherCircle = (Circle) circle.clone();
        anotherCircle.radius=2;
        System.out.printf("Area of Copy Circle:%.2f%n",anotherCircle.area());
        System.out.println(anotherCircle.properties());


        // Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.height=2;
        rectangle.width=4;
        System.out.println("Area of Rectangle:"+rectangle.area());
        System.out.println(rectangle.properties());

        Rectangle anotherRectangle= (Rectangle) rectangle.clone();
        anotherRectangle.height=3;
        anotherRectangle.width=5;
        System.out.println("Area of Copy Rectangle:"+anotherRectangle.area());
        System.out.println(anotherRectangle.properties());
    }

}
