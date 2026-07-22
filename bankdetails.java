class Bank
{
long accountNo;
String holderName;
double balance;
void display()
{
System.out.println("Account No : " + accountNo);
System.out.println("Holder Name : " + holderName);
System.out.println("Balance : " + balance);
}
}
public class bankdetails
{
public static void main(String[] args)
{
Bank b1 = new Bank();
b1.accountNo = 1234567890;
b1.holderName = "Durga";
b1.balance = 50000.00;
b1.display();
}
}