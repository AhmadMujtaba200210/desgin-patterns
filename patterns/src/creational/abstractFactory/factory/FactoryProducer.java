package creational.abstractFactory.factory;

// this is an abstract factory class
public class FactoryProducer {
    public static GUIFactory getFactory(String str){
        return switch (str) {
            case "MacOS" -> new MacOSFactory();
            case "Windows" -> new WindowsFactory();
            default -> null;
        };
    }
}
