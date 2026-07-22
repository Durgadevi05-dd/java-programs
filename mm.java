class mca1
{
int rollNo;
String name;
void display()
{
System.out.println("Roll No:"+rollNo);
System.out.println("Name:"+name);
}
}
public class mm
{
public static void main(String[] args)
{
mca1 s1=new mca1();
s1.rollNo=101;
s1.name="Durga";
s1.display();
}
}
