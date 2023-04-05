package creational.factory;

import creational.factory.factory.DialogFactory;
import creational.factory.factory.FactoryProducer;

public class FactoryMain {
    public static void main(String[] args) {
        DialogFactory dialogFactory= FactoryProducer.getInstance("Windows");
        dialogFactory.renderButton();

        dialogFactory=FactoryProducer.getInstance("HTML");
        dialogFactory.renderButton();

    }
}
