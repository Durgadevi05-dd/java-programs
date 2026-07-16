import java.util.Scanner;
class emparray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a [][]=new int[3][3];
        int max=0;
        System.out.println("Enter the salesamount");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            int sum=0;
            for(int j=0;j<a[i].length;j++)
            {
            System.out.print(a[i][j] +" ");
            sum+=a[i][j];
            }System.out.println(" = " + sum);
         if(max<sum)
         {
             max=sum;
         }
        }System.out.println("Maximum salesamount is " + max);
    }
}