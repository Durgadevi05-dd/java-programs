import java.util.ArrayList;
public class arraylisttask2
{
    public static void main(String[] args)
    {
        ArrayList<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");
        products.add("Mouse");
        products.add("Keyboard");
        System.out.println("After adding: " + products);
        System.out.println("Product at index 2: " + products.get(2));
        products.set(1, "Smart Watch");
        System.out.println("After updating: " + products);
        products.remove("Mouse");
        System.out.println("After removing: " + products);
        System.out.println("Number of products: " + products.size());
        System.out.println("Contains Laptop: " + products.contains("Laptop"));
        products.clear();
        System.out.println("After clearing: " + products);
    }
}