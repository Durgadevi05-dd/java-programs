class arreven
{
   public static void main(String[] args)
   {
    int[] arr={20,50,10,80,60};
    int count=0;
    for(int i=1;i<arr.length;i++)
    {
     if(arr[i]%2==0)
     {
      count++;
     }
    }
System.out.println("Count Even Numbers="+count);
}
}
