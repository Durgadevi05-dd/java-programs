class Product
{
    String productName = "Smart Watch";
    double price = 600;
    String category = "Electronics";

    void displayProductDetails()
    {
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Original Price: $" + price);
    }
}

class ElectronicProduct extends Product
{
    int warrantyPeriod = 3;

    void calculate()
    {
        double discount = 0;

        if(price >= 500)
        {
            discount = price * 0.10;
        }

        double finalPrice = price - discount;

        System.out.println("Discount: $" + discount);
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Warranty: " + warrantyPeriod + " years");

        if(warrantyPeriod >= 2)
        {
            System.out.println("Free Extended Warranty: Yes");
        }
        else
        {
            System.out.println("Free Extended Warranty: No");
        }

        if(finalPrice < 100)
        {
            System.out.println("Delivery Charge: $10");
        }
        else
        {
            System.out.println("Delivery Charge: $0");
        }
    }
}

class singleinheritancetask
{
    public static void main(String[] args)
    {
        ElectronicProduct e = new ElectronicProduct();

        e.displayProductDetails();
        e.calculate();
    }
}