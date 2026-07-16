class minsumsubArrays
{
public static void main(String[] args)
{
int[] arr={1,2,3};
int minSum=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++)
{
int sum=0;
for(int j=i;j<arr.length;j++)
{
sum+=arr[j];
if(sum<minSum)
{
minSum=sum;
}
}
}
System.out.println("Minimum Sum="+minSum);
}
}