interface UPIPayment
{
    void upiPayment();
}

interface CardPayment
{
    void cardPayment();
}

class PaymentService implements UPIPayment, CardPayment
{
    public void upiPayment()
    {
        System.out.println("UPI Payment");
        System.out.println("UPI ID: durga@upi");
        System.out.println("Amount: $50000");
    }

    public void cardPayment()
    {
        System.out.println("Credit Card Payment");
        System.out.println("Card Number: 1234 5678 9012 3456");
        System.out.println("Amount: $500");
    }
}

class multipleinheritancetask
{
    public static void main(String[] args)
    {
        PaymentService p = new PaymentService();

        p.upiPayment();
        p.cardPayment();
    }
}