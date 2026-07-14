import java.util.Scanner;
public class withdrawal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int max = 0;
        for(int i = 1; i <= n; i++) 
        {
            int withdrawal = sc.nextInt();
            total = total + withdrawal;
            if(withdrawal > max) 
            {
                max = withdrawal;
            }
        }
        System.out.println("Total Withdrawal = " + total);
        System.out.println("Highest Withdrawal = " + max);
    }
}