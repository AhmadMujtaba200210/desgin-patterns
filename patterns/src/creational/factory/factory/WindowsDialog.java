package creational.factory.factory;

import creational.factory.button.Button;
import creational.factory.button.WindowsButton;

public class WindowsDialog implements DialogFactory{

    @Override
    public void renderButton() {
        Button bt=createButton();
        bt.render();
        bt.onClick();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
