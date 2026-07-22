public class student
{
student()
{
System.out.println("Default Constructor");
}
student(String name)
{
System.out.println("Student Name="+name);
}
student(String name,int age)
{
System.out.println("Student Name="+name);
System.out.println("Student Age="+age);
}
public static void main(String[] args)
{
student s1=new student();
student s2=new student("Durgadevi");
student s3=new student("Durgadevi",21);
}
}