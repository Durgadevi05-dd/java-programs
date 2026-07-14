import java.util.Scanner;
public class Sale
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of days:");
        int day=sc.nextInt();
        int max=0;
        System.out.println("Enter the " + day + " Sales value:");
        
        
        for(int i=1;i<=day;i++)
        {
            int sales=sc.nextInt();
            if(sales>max)
            {
                max=sales;
            }
           
        }
         System.out.println("Maximum sales="+max);
        
        
    }
}