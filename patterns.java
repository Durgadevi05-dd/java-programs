import java.util.Scanner;
class patterns
{
    public static void main(String[] args)
    {
        int num=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i=i+1)
        {
            for(int j=1;j<=n;j=j+1)
            {
                System.out.print(num+ " ");
            }
         System.out.println();

        }
    }
}