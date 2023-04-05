package creational.abstractFactory.factory;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.button.MacOSButton;
import creational.abstractFactory.checkbox.CheckBox;
import creational.abstractFactory.checkbox.MacOSCheckBox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
