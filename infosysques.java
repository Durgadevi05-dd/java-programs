import java.util.Scanner;
class Student 
{
private int marks;
public void setMarks(int marks) 
{
if (marks >= 0 && marks <= 100) 
{
this.marks = marks;
} 
else 
{
System.out.println("Invalid Marks");
}
}
public int getMarks() 
{
return marks;
}
}

public class infosysques
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Student s = new Student();
System.out.print("Enter Marks: ");
int marks = sc.nextInt();
s.setMarks(marks);
if (marks >= 0 && marks <= 100) 
{
System.out.println("Marks : " + s.getMarks());
 }
sc.close();
    }
}