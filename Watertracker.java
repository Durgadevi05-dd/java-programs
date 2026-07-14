import java.util.Scanner;
class watertracker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter water intake (in ml) 8 times:");
        for(int i = 1; i <= 8; i++)
        {
            System.out.print("Time " + i + ": ");
            int water = sc.nextInt();
            total = total + water;
        }
        System.out.println("Total Water Consumed = " + total + " ml");
    }
}