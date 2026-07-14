import java.util.Scanner;
class linearemployee
{
    public static void main(String[] args)
    {
        int[] empId = {101, 102, 103, 104, 105};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int key = sc.nextInt();
        int found = 0;
        for(int i = 0; i < empId.length; i++)
        {
            if(empId[i] == key)
            {
                found = 1;
                break;
            }
        }
        if(found == 1)
        {
            System.out.println("Employee Found");
        }
        else
        {
            System.out.println("Employee Not Found");
        }
    }
}