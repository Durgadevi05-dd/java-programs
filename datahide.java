class student
{
private int age;
public void setAge(int age)
{
if(age>0)
{
this.age=age;
}
}
public int getAge()
{
return age;
}
}
public class datahide
{
public static void main(String[] args)
{
student s=new student();
s.setAge(20);
System.out.println(s.getAge());
}
}