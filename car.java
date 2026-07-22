class Car
{
    String carName;
    String model;
    String brand;

    void display()
    {
        System.out.println("Car Name : " + carName);
        System.out.println("Model : " + model);
        System.out.println("Brand : " + brand);
    }
}

public class carcode
{
    public static void main(String[] args)
    {
        Car c1 = new Car();

        c1.carName = "Creta";
        c1.model = "SX(O)";
        c1.brand = "Hyundai";

        c1.display();
    }
}