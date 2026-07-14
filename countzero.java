public class countzero
{
public static void main(String[] args)
{
int[] arr={10,-2,0,30,0,25,0,100};
int count=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==0)
{
count++;
}
}
System.out.println("Count Zeroes="+count);
}
}