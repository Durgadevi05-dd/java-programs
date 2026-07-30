import java.util.ArrayList;

public class ProductInventorytask
{
    public static void main(String[] args)
    {
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> stock = new ArrayList<>();

        products.add("Rice");
        stock.add(50);

        products.add("Sugar");
        stock.add(30);

        products.add("Oil");
        stock.add(20);

        System.out.println("Products: " + products);
        System.out.println("Stock: " + stock);

        System.out.println("Contains Rice: " + products.contains("Rice"));

        stock.set(1, 25);
        System.out.println("After Updating Stock: " + stock);

        int index = products.indexOf("Oil");
        products.remove(index);
        stock.remove(index);

        System.out.println("After Removing Product:");
        for(int i = 0; i < products.size(); i++)
        {
            System.out.println(products.get(i) + " - " + stock.get(i));
        }
    }
}