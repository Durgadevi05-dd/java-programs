class maxprosubArrays
{
    public static void main(String[] args)
    {
        int[] arr = {2, 3, -2, 4};

        int maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            int product = 1;

            for(int j = i; j < arr.length; j++)
            {
                product *= arr[j];

                if(product > maxProduct)
                {
                    maxProduct = product;
                }
            }
        }

        System.out.println("Maximum Product = " + maxProduct);
    }
}