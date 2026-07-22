class student
{
int age;
void setAge(int age)
{
this.age=age;
}
void display()
{
System.out.println(age);
}
}
public class thisexample1
{
public static void main(String[] args)
{
student s=new student();
s.setAge(21);
s.display();
}
}