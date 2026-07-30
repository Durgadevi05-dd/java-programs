import java.util.ArrayList;
import java.util.LinkedList;

public class Ecommercetask
{
    public static void main(String[] args)
    {
        ArrayList<String> products = new ArrayList<>();
        LinkedList<String> orders = new LinkedList<>();
        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphone");
        orders.add("Order1");
        orders.add("Order2");
        orders.add("Order3");
        System.out.println("Products: " + products);
        System.out.println("Orders: " + orders);
        products.remove("Mobile");
        orders.removeFirst();
        orders.addLast("Order4");
        System.out.println("Updated Products: " + products);
        System.out.println("Updated Orders: " + orders);
        System.out.println("Available Products:");
        for(String p : products)
        {
            System.out.println(p);
        }

        System.out.println("Pending Orders:");
        for(String o : orders)
        {
            System.out.println(o);
        }

        System.out.println("Contains Laptop: " + products.contains("Laptop"));

        System.out.println("Total Products: " + products.size());
        System.out.println("Total Orders: " + orders.size());
    }
}