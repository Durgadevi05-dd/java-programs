import java.util.Scanner;
class Main1{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int [] keys={10,40,30};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<keys.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Keys is found at" + i);
                    break;
                }
            }
            System.out.println("Element is Not Found");
        }
    }
}