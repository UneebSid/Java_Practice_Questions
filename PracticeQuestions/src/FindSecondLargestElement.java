public class FindSecondLargestElement
{
    public static int findSecondLargest(int[] nums)
    {
        //checking if arrays has at least 2 elements
        if(nums == null || nums.length < 2)
        {
            System.out.println("Array must have atleast 2 elements");
            return 0;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int n : nums)
        {
            if(n > largest)
            {
                secondLargest =largest;
                largest = n;
            }else if(n > secondLargest)
            {
                secondLargest = n;
            }
        }
        return secondLargest;
    }
}
