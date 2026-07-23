class student
{
int rollNo;
String name;
String department;
void getData(int rollNo,String name,String department)
{
this.rollNo=rollNo;
this.name=name;
this.department=department;
}
void display()
{
System.out.println("Roll No:"+rollNo);
System.out.println("Student Name:"+name);
System.out.println("Department:"+department);
}
}
public class thisexample3
{
public static void main(String[] args)
{
student s1=new student();
s1.getData(101,"Durga","MCA");
s1.display();
}
}