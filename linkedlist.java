import java.util.LinkedList;
public class linkedlist
{
public static void main(String[] args)
{
LinkedList<String> names=new LinkedList<>();
names.add("Anu");
names.add("Ravi");
names.add("Kumar");
System.out.println(names);
names.addFirst("Priya");
names.addLast("Vijay");
System.out.println(names);
System.out.println(names.getFirst());
System.out.println(names.getLast());
}
}








