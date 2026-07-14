import java.util.Scanner;
class Menu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Idli");
        System.out.println("2. Dosa");
        System.out.println("3. Pongal");
        System.out.println("4. Poori");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Idli - Rs.30");
                break;
            case 2:
                System.out.println("Dosa - Rs.50");
                break;
            case 3:
                System.out.println("Pongal - Rs.40");
                break;
            case 4:
                System.out.println("Poori - Rs.45");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}