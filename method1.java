import java.util.Scanner;
public class method1
{
static void checkBalance(double balance,double withdrawalAmount)
{
if(withdrawalAmount<=balance)
{
System.out.println("Withdrawal Successfull");
balance=balance-withdrawalAmount;
System.out.println("Remaining Balance: "+balance);
}
else
{
System.out.println("Insufficient Balance");
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Balance: ");
double balance=sc.nextDouble();
System.out.print("Enter withdrawal Amount: ");
double withdrawalAmount=sc.nextDouble();
checkBalance(balance,withdrawalAmount);
}
}