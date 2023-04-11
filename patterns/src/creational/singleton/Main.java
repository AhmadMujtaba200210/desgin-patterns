package creational.singleton;

public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffee=CoffeeMachine.getInstance();
        coffee.setDetails(1.5F,2.0F);
        System.out.println(coffee.getDetails());
    }
}
