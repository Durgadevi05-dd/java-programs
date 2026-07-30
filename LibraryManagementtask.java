import java.util.ArrayList;
import java.util.LinkedList;
public class LibraryManagementtask
{
    public static void main(String[] args)
    {
        ArrayList<String> books = new ArrayList<>();
        LinkedList<String> issuedBooks = new LinkedList<>();
        books.add("Java");
        books.add("Python");
        books.add("C");
        books.add("C++");
        System.out.println("Library Books: " + books);
        issuedBooks.add("Java");
        issuedBooks.add("Python");
        System.out.println("Issued Books: " + issuedBooks);
        issuedBooks.addLast("C");
        System.out.println("After Issuing: " + issuedBooks);
        issuedBooks.removeFirst();
        System.out.println("After Returning: " + issuedBooks);
        System.out.println("Contains Java: " + books.contains("Java"));
    }
}