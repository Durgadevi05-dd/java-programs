class Account {
String name;
double balance;
Account(String name, double balance) 
{
        this.name = name;
        this.balance = balance;
}
void calculateInterest() 
{
        System.out.println("Interest Calculation");
}
}
class SavingsAccount extends Account 
{

    SavingsAccount(String name, double balance) 
{
        super(name, balance);
}
@Override
void calculateInterest() 
{
        double interest = balance * 0.05;
        System.out.println("Savings Account");
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
        System.out.println("Interest : " + interest);
}
}

class CurrentAccount extends Account 
{

    CurrentAccount(String name, double balance) 
{
   super(name, balance);
}
@Override
void calculateInterest() 
{
        double interest = balance * 0.02;
        System.out.println("Current Account");
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
        System.out.println("Interest : " + interest);
    }
}

public class bankingsystem
{

    public static void main(String[] args) 
{

        Account a1 = new SavingsAccount("Durga", 50000);
        Account a2 = new CurrentAccount("Devi", 70000);

        a1.calculateInterest();
        System.out.println();
        a2.calculateInterest();
    }
}