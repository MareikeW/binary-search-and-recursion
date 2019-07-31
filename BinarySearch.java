import java.util.*;

/*BinarySearch in a sorted array*/

public class BinarySearch {
    public static void main(String[] args) {
        //create a sorted array
        int arr[] = { 1, 5, 7, 8, 9, 11, 18, 19, 20, 25 };
        Arrays.sort(arr);

        //determine a target to find in the list
        int target = 25;

        //display array and output
        System.out.println(Arrays.toString(arr));
        System.out.println("Target: "+ target + " found at index: " + findTarget(arr, target));
    }
    public static int findTarget(int[] arr, int target) {
        //find targets index in array and return output
        int output = Arrays.binarySearch(arr, target);

        return output;
    }
}
