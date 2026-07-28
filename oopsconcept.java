class Product
{
    int productId;
    String productName;
    private double price;

    void setData(int id, String name, double p)
    {
        productId = id;
        productName = name;
        price = p;
    }

    double getPrice()
    {
        return price;
    }

    void display()
    {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + getPrice());
    }
}

class ElectronicProduct extends Product
{
    int warranty = 2;

    void display()
    {
        super.display();
        System.out.println("Warranty: " + warranty + " years");
    }
}

class ClothingProduct extends Product
{
    String size = "L";

    void display()
    {
        super.display();
        System.out.println("Size: " + size);
    }
}

interface Payment
{
    void pay();
}

class UPI implements Payment
{
    public void pay()
    {
        System.out.println("Payment Method: UPI");
    }
}

class CreditCard implements Payment
{
    public void pay()
    {
        System.out.println("Payment Method: Credit Card");
    }
}

class oopsconcept
{
    public static void main(String[] args)
    {
        ElectronicProduct e = new ElectronicProduct();
        e.setData(101, "Laptop", 50000);
        e.display();

        System.out.println();

        ClothingProduct c = new ClothingProduct();
        c.setData(102, "T-Shirt", 1000);
        c.display();

        System.out.println();

        UPI u = new UPI();
        u.pay();

        CreditCard cc = new CreditCard();
        cc.pay();
    }
}