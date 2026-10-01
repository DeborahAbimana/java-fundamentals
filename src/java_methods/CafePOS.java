package java_methods;

public class CafePOS extends Cafe{

    public static void main(String[] args) {
CafePOS cafe=new CafePOS();
cafe.cafeName="Deborah's Cafe";
cafe.openCafe();
        String customerName = "Alex";
        double coffeePrice = 4.50;
        int quantity = 4;
        boolean hasLoyaltyCard = true;

        double baseTotal = coffeePrice * quantity;

        double discountedTotal;

        if (hasLoyaltyCard) {
            discountedTotal = baseTotal - 2.50;

        } else if (baseTotal > 15.00) {
            discountedTotal = baseTotal - (baseTotal * 0.10);

        } else {
            discountedTotal = baseTotal;
        }

        if (discountedTotal < 0) {
            discountedTotal = 0;
        }

        System.out.println("Brewing in 3...");
        System.out.println("Brewing in 2...");
        System.out.println("Brewing in 1...");
        System.out.println("Coffee is ready!");

        double finalAmount = calculateTax(discountedTotal, 0.08);

        generateReceipt(customerName, finalAmount);
    }

    public static double calculateTax(double amount, double taxRate) {
        double taxAmount = amount * taxRate;
        return amount + taxAmount;
    }

    public static void generateReceipt(String name, double finalAmount) {
        System.out.println();
        System.out.println("==============================");
        System.out.println("          CAFE RECEIPT");
        System.out.println("==============================");
        System.out.println("Customer: " + name);
        System.out.printf("Final Total: $%.2f%n", finalAmount);
        System.out.println("==============================");
        System.out.println("Thank you!");
        System.out.println("==============================");
    }
}