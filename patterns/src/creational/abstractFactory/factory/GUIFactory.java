package creational.abstractFactory.factory;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.checkbox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
