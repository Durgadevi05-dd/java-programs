import java.util.LinkedList;
public class linkedlisttask3
{
    public static void main(String[] args)
    {
        LinkedList<String> names = new LinkedList<>();

        names.add("Arun");
        names.add("Bala");
        names.add("Charan");
        names.add("Divya");
        names.add("Elango");

        System.out.println(names);

        names.addLast("Fathima");

        names.addFirst("VIP Customer");

        System.out.println(names);

        names.remove("Charan");

        System.out.println(names);

        names.set(2, "Bala VIP");

        System.out.println(names);

        System.out.println(names.contains("Divya"));

        System.out.println("Final List: " + names);

        System.out.println("Size: " + names.size());
    }
}