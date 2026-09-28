package java_objects;

    public class ShoppingCart {

    
    private int totalItems;
    private double totalPrice;

    public void addItem(double price) {

        if (price > 0) {
            totalItems++;
            totalPrice = totalPrice + price;

            System.out.println(getCartSummary());
        } else {
            System.out.println("Invalid price.");
        }
    }

    
    public void removeItem(double price) {

        if (totalItems > 0 && price > 0) {
            totalItems--;
            totalPrice = totalPrice - price;

            System.out.println(getCartSummary());
        } else {
            System.out.println("Cannot remove item.");
        }
    }

    
    public void emptyCart() {

        totalItems = 0;
        totalPrice = 0;

        System.out.println("Cart has been emptied.");
    }

    
    private String getCartSummary() {

        return "Cart has " + totalItems
                + " items added(or removed) Total: $"
                + String.format("%.2f", totalPrice);
    }

    
    public int getTotalItems() {
        return totalItems;
    }


    public double getTotalPrice() {
        return totalPrice;
    }
}

