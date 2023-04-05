package creational.abstractFactory.factory;

public class FactoryProducer {
    public static GUIFactory getFactory(String str){
        return switch (str) {
            case "MacOS" -> new MacOSFactory();
            case "Windows" -> new WindowsFactory();
            default -> null;
        };
    }
}
