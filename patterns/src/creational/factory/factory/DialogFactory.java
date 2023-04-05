package creational.factory.factory;

import creational.factory.button.Button;
import creational.factory.button.HTMLButton;

public interface DialogFactory {
    void renderButton();
    Button createButton();
}
