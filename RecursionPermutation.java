import java.util.Arrays;

/* Create an array list of ins ant generate all permutations using a recursive function. */

public class RecursionPermutation {

    //main method to generate all permutations in the following int array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printPermutn(arr, 0);
    }

    //Recursive function to generate all permutations of the int array and print them
    public static void printPermutn(int[] arr, int index) {

        if (index == arr.length - 1){
            System.out.println(Arrays.toString(arr));
        }

        for (int i = index; i < arr.length; i++) {

            swap(arr, index, i);
            printPermutn(arr, index + 1);
            swap(arr, index, i);
        }
    }
    //Utility function to swap two ints in the int array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
