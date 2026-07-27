interface Father
{
void house();
}
interface Mother
{
void car();
}
class Child implements Father,Mother
{
public void house()
{
System.out.println("Father has a house");
}
public void car()
{
System.out.println("Mother has a car");
}
}
class multipleinheritance
{
public static void main(String[] args)
{
Child C=new Child();
C.house();
C.car();
}
}