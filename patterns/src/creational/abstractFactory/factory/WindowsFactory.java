package creational.abstractFactory.factory;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.button.WindowsButton;
import creational.abstractFactory.checkbox.CheckBox;
import creational.abstractFactory.checkbox.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
