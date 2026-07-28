class exceptionhandlingtask
{
    public static void main(String[] args)
    {
        int balance = 10000;
        int transactions = 0;

        try
        {
            int average = balance / transactions;
            System.out.println("Average Withdrawal: " + average);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot calculate average");
        }
        finally
        {
            System.out.println("Thank you for using the ATM");
        }
    }
}