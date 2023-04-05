package creational.abstractFactory;

import creational.abstractFactory.factory.FactoryProducer;
import creational.abstractFactory.factory.GUIFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        // MacOS Factory accessing through GUI Factory (abstract Factory)
        GUIFactory factory= FactoryProducer.getFactory("MacOS");
        factory.createButton().paint();
        factory.createCheckBox().paint();

        // Windows Factory accessing through GUI Factory (abstract Factory)
        factory=FactoryProducer.getFactory("Windows");
        factory.createButton().paint();
        factory.createCheckBox().paint();
    }
}
