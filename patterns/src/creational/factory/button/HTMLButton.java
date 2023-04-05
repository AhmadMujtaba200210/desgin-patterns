package creational.factory.button;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering HTML Button");
    }

    @Override
    public void onClick() {
        System.out.println("You clicked on HTML Button");
    }
}
