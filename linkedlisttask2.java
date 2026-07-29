import java.util.LinkedList;

public class linkedlisttask2
{
    public static void main(String[] args)
    {
        LinkedList<String> patients = new LinkedList<>();

        patients.add("Arun");
        patients.add("Ravi");
        patients.add("Kumar");
        patients.add("Priya");

        System.out.println(patients);

        patients.addFirst("VIP");

        patients.addLast("Anu");

        System.out.println(patients);

        patients.removeFirst();

        patients.removeLast();

        System.out.println(patients);

        System.out.println(patients.getFirst());

        System.out.println(patients.getLast());

        System.out.println("Final List: " + patients);
    }
}