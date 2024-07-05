package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    private static void mergeSort(int[] arr, int start, int end) {
       if(start < end) {
    	  int mid = (start + end)/2;
    	  mergeSort(arr, start, mid);
    	  mergeSort(arr,mid+1,end);
    	  merge(arr,start,mid,end);
       }
    }

   
    private static void merge(int[] arr, int start, int mid, int end) {
    	int i = start;
    	int j = mid+1;
    	int k = 0;
    	int [] brr = new int[end +1];
    	
    	while(i <= mid && j<= end) {
    		if(arr[i] <=  arr[j]) {
    			brr[k] = arr[i]; 
    			i++;
    			k++;
    		}
    		else {
    			brr[k] = arr[j];
    			j++;
    			k++;
    		}
    	}
    	
    	while(i <= mid) {
    		brr[k] = arr[i];
    		i++;
    		k++;
    	}
    	
    	while(j <= end) {
    		brr[k] = arr[j];
    		j++;
    		k++;
    	}
    	

    	for(i = start ; i<= end ; i++ ) {
    		arr[i] = brr[i-start];
    	}
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

        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array by Merge Sort : " + Arrays.toString(arr));
    }
}


//