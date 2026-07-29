import java.util.LinkedList;

public class linkedlisttask1
{
    public static void main(String[] args)
    {
        LinkedList<String> products = new LinkedList<>();

        products.add("Laptop");
        products.add("Mobile");
        products.add("Mouse");

        System.out.println(products);

        products.addFirst("Keyboard");
        products.addLast("Headphone");

        System.out.println(products);

        System.out.println(products.getFirst());

        System.out.println(products.getLast());

        products.removeFirst();

        System.out.println(products);

        products.removeLast();

        System.out.println(products);
    }
}