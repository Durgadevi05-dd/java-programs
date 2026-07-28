class Account
{
    int accountNumber = 101;
    String customerName = "Durga";

    void displayAccount()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
    }
}

class SavingsAccount extends Account
{
    double interestRate = 6.5;

    void displaySavings()
    {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends Account
{
    double overdraftLimit = 10000;

    void displayCurrent()
    {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

class hierarchicalinheritancetask
{
    public static void main(String[] args)
    {
        SavingsAccount s = new SavingsAccount();
        s.displayAccount();
        s.displaySavings();

        System.out.println();

        CurrentAccount c = new CurrentAccount();
        c.displayAccount();
        c.displayCurrent();
    }
}