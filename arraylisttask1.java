import java.util.ArrayList;

public class arraylisttask1
{
    public static void main(String[] args)
    {
        ArrayList<String> students = new ArrayList<>();
        students.add("Arun");
        students.add("Kumar");
        students.add("Priya");
        students.add("Ravi");
        students.add("Divya");
        System.out.println("After adding: " + students);
        System.out.println("Element at index 2: " + students.get(2));
        students.set(3, "Karthik");
        System.out.println("After updating: " + students);
        students.remove("Arun");
        System.out.println("After removing: " + students);
        System.out.println("Number of students: " + students.size());
        System.out.println("Contains Kumar: " + students.contains("Kumar"));
        students.clear();
        System.out.println("After clearing: " + students);
    }
}