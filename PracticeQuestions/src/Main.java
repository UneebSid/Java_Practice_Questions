// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {





    public static void main(String[] args)
    {
        int[] arr = {1,32,29,100,125,5,200};
        int[] largestThree = new int[3];
              largestThree = FindLargestThreeElements.findLargestThree(arr);
        System.out.println("The largest 3 elements are ");
        for (int n: largestThree) {
            System.out.println(n);
        }
        System.out.println("The second largest element in the array is: ");
        System.out.println(FindSecondLargestElement.findSecondLargest(arr));
    }
}