class lineartask1
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 20, 40, 20, 50};
        int key = 20;
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                count++;
            }
        }
        if(count > 0)
        {
            System.out.println(key + " appears " + count + " times.");
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }
}