public class SalesTax {

    public static void main(String[] args){
        double priceOfPurchase = 75;
        double priceOfTax;
        double priceAfterTax;

        priceOfTax = priceOfPurchase * .05;
        priceAfterTax = priceOfTax + priceOfPurchase;
        System.out.println("The total price is " + priceOfPurchase + "$ the cost of tax is " + priceOfTax + "$ the total price is " + priceAfterTax + "$");
    }
}

