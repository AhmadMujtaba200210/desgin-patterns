package creational.abstractFactory.checkbox;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
            System.out.println("You're printing MacOS CheckBox");
    }
}
