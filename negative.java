class negative
{
    public static void main(String[] args)
    {
        int[] arr = {20, -50, 10, -80, 60};
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0)
            {
                count++;
            }
        }

        System.out.println("Count Negative Numbers = " + count);
    }
}