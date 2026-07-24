import java.util.Scanner;
class Employee 
{
private int empId;
private String name;
private double salary;
public void setEmpId(int empId) 
{
this.empId = empId;
}
public void setName(String name) 
{
this.name = name;
}
public void setSalary(double salary) 
{
if (salary < 0) 
{
System.out.println("Invalid Salary");
} 
else 
{
this.salary = salary;
}
}
public int getEmpId() 
{
return empId;
}
public String getName()
{
return name;
}
public double getSalary() 
{
return salary;
}
}

public class TCSques
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
Employee e = new Employee();
System.out.print("Enter Employee ID: ");
e.setEmpId(sc.nextInt());
sc.nextLine();
System.out.print("Enter Employee Name: ");
e.setName(sc.nextLine());
System.out.print("Enter Salary: ");
e.setSalary(sc.nextDouble());
System.out.println("\nEmployee ID : " + e.getEmpId());
System.out.println("Employee Name : " + e.getName());
System.out.println("Salary : " + e.getSalary());
}
}