public class OrderApp {

    public static void main(String[] args) {
        String customerName = (args.length > 0) ? args[0] : "Alice";

        int quantity = 5;
        double pricePerUnit = 250.0;

        double totalAmount = quantity * pricePerUnit;

        // This util class is compiled in Discount project and made available by Jenkins
        double discount = DiscountUtil.calculateDiscount(totalAmount);
        double finalAmount = totalAmount - discount;

        System.out.println("=== Order Application ===");
        System.out.println("Customer       : " + customerName);
        System.out.println("Quantity       : " + quantity);
        System.out.println("Price per unit : " + pricePerUnit);
        System.out.println("Total amount   : " + totalAmount);
        System.out.println("Discount       : " + discount);
        System.out.println("Final amount   : " + finalAmount);
        System.out.println("==========================");
    }
}
