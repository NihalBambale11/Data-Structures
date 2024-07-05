package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int loc = partition(arr, start, end);
            quickSort(arr, start, loc - 1);
            quickSort(arr, loc + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        
    	int pivot = arr[start];
        int low = start + 1;
        int high = end;

        while (low <= high) {
           
        	while (low <= high && arr[low] <= pivot) {
                low++;
            }
            
            while (low <= high && arr[high] >= pivot) {
                high--;
            }
            
            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }

        int temp = arr[start];
        arr[start] = arr[high];
        arr[high] = temp;

        return high;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array by Quick Sort: " + Arrays.toString(arr));
    }
}




//consider left element as pivot
//1. from left (i -index) find element greater than pivot
//2. from right (j-index) find element less than or equal to pivot.
//3. if i less than j, swap ith element with jth element;
//4. repeat steps 1-3 , till i < j
//5. swap jth elements with jth elements
