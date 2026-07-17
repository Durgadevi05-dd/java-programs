public class str8
{
    public static void main(String[] args)
    {
        char[] arr = {'J','A','V','A'};
        String rev = "";
        for(int i = arr.length - 1; i >= 0; i--)
        {
            rev = rev+arr[i];
        }
        System.out.println(rev);
    }
}