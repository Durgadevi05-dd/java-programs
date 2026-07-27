interface RideBooking
{
    void bookRide();
}

interface Payment
{
    void payFare();
}

class CabService implements RideBooking, Payment
{
    public void bookRide()
    {
        System.out.println("Pickup Location: K.kovil");
        System.out.println("Destination: Chennai");
        System.out.println("Cab Type: Sedan");
    }

    public void payFare()
    {
        System.out.println("Fare Amount: 1750");
        System.out.println("Payment Status: Paid");
    }
}

class multipleinheritancetask3
{
    public static void main(String[] args)
    {
        CabService c = new CabService();

        c.bookRide();
        c.payFare();
    }
}