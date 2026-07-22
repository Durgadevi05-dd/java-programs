class Employee
{
int id;
String name;
int age;
double salary;
void display()
{
System.out.println("Employee ID : " + id);
System.out.println("Employee Name : " + name);
System.out.println("Employee Age : " + age);
System.out.println("Employee Salary : " + salary);
}
}
public class employeecode
{
public static void main(String[] args)
{
Employee e1 = new Employee();
e1.id = 101;
e1.name = "Durga";
e1.age = 21;
e1.salary = 55000;
e1.display();
}
}