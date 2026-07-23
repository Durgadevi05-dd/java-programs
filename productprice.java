class Product
{
private double price;
public void setPrice(double price)
{
 if(price > 0)
{
this.price = price;
}
else
{
System.out.println("Invalid Price");
}
}
public double getPrice()
{
return price;
}
}
public class productprice
{
public static void main(String[] args)
{
Product p = new Product();
p.setPrice(2500);
System.out.println("Product Price : " + p.getPrice());
}
}