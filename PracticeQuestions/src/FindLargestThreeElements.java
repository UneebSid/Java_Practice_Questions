public class FindLargestThreeElements
{
    public static int[] findLargestThree(int[] nums)
    {
        if(nums==null || nums.length < 3)
        {
            System.out.println("Array must have at least 3 elements.");
            return null;
        }


        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int thirdLarge = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]> largest)
            {
                thirdLarge = secondLarge;
                secondLarge = largest;
                largest = nums[i];
            } else if(nums[i] > secondLarge)
            {
                thirdLarge = secondLarge;
                secondLarge = nums[i];
            } else if(nums[i] > thirdLarge)
            {
                thirdLarge = nums[i];
            }
        }

        return new int[]{largest,secondLarge,thirdLarge};
    }
}
