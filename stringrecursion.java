import java.util.Scanner;
public class stringrecursion
{
static void printEmployeeID(int current, int n)
{
if (current > n) 
{
return;
}
System.out.println("Employee ID: " + current);
printEmployeeID(current + 1, n);
}
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
printEmployeeID(1, n);
}
}