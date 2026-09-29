package java_methods;

public class CafeIngredients {
    private String customerName;
    private double coffeePrice;

    public CafeIngredients(String customerName,double coffeePrice){
        this.customerName=customerName;
        this.coffeePrice=coffeePrice;

    }

public String getCustomerName(){
    return customerName;
}
public void setCustomerName(String customerName){
    this.customerName=customerName;

}
public double getCoffeePrice(){
    return coffeePrice;

}
public void setCoffeePrice(double coffeePrice){
    this.coffeePrice=coffeePrice;
}
}