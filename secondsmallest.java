import java.util.Arrays;
public class secondsmallest
{
  public static void main(String[] args)
  {
    int[] arr={20,50,10,80,60};
    Arrays.sort(arr);
    System.out.println("Second Smallest Number="+arr[1]);
  }
}