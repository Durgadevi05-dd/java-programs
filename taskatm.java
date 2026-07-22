import java.util.Scanner;
public class taskatm 
{
static double balance;
static void deposit(double depositAmount) 
{
balance = balance + depositAmount;
System.out.println("Deposit Successful");
System.out.println("Current Balance: " + balance);
}
static void withdrawal(double withdrawalAmount) 
{
if (withdrawalAmount <= balance) 
{
balance = balance - withdrawalAmount;
System.out.println("Withdrawal Successful");
System.out.println("Remaining Balance: " + balance);
} 
else 
{
System.out.println("Insufficient Balance");
}
}
static void checkBalance() 
{
System.out.println("Available Balance: " + balance);
}
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Initial Balance: ");
balance = sc.nextDouble();
System.out.print("Enter Deposit Amount: ");
double depositAmount = sc.nextDouble();
deposit(depositAmount);
System.out.print("Enter Withdrawal Amount: ");
double withdrawalAmount = sc.nextDouble();
withdrawal(withdrawalAmount);
checkBalance();
}
}