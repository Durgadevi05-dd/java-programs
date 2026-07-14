import java.util.Scanner;
class Attendance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int present=0;
        int absent=0;
        System.out.println("Enter attendance for 30 students");
        System.out.println("(1 = Present, 0 = Absent)");
        for(int i=1;i<=30;i++)
        {
            System.out.print("Student " + i + ": ");
            int attendance = sc.nextInt();
            if(attendance == 1)
            {
                present++;
            }
            else if(attendance == 0)
            {
                absent++;
            }
        }
        System.out.println("\nTotal Present Students = " + present);
        System.out.println("Total Absent Students = " + absent);
    }
}