package creational.factory.factory;

import creational.factory.button.WindowsButton;

public class FactoryProducer {
    public static DialogFactory getInstance(String str){
        return switch (str){
            case "HTML"-> new HTMLDialog();
            case "Windows"-> new WindowsDialog();
            default -> null;
        };
    }
}
