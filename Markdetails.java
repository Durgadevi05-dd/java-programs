import java.util.Scanner;
class Markdetails
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 subject marks:");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int total=m1+m2+m3+m4+m5;
        int avg=total/5;
        System.out.println("Total="+total);
        System.out.println("Average="+avg);
        if(avg>=90)
            System.out.println("Grade A");
        else if(avg>=80)
            System.out.println("Grade B");
        else if(avg>=70)
            System.out.println("Grade C");
        else if(avg>=60)
            System.out.println("Grade D");
        else if(avg>=50)
            System.out.println("Grade E");
        else
            System.out.println("Fail");
    }
}