public class printsubArrays
{
public static void main(String[] args)
{
int[] arr={10,20,30};
for(int start=0;start<arr.length;start++)
{
for(int end=start;end<arr.length;end++)
{
for(int i=start;i<=end;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println();
}
}
}
}