package creational.singleton;

public class CoffeeMachine {
    private float sugar;
    private float milk;
    private static CoffeeMachine model;
    private String cream=null;

    private CoffeeMachine(){

    }

    public static CoffeeMachine getInstance(){
        if (model==null) model= new CoffeeMachine();
        return model;
    }

    public void setDetails(float sugar,float milk){
        this.sugar=sugar;
        this.milk=milk;
        System.out.println("details added");
    }
    public String getDetails(){
        if (cream==null)
        return "Sugar:"+sugar+" Milk:"+milk;
        else return "Sugar:"+sugar+" Milk:"+milk+" Cream Type:"+cream;
    }
    public void addTopping(String cream){
        this.cream=cream;
        System.out.println("Added topping");
    }
}
