package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	
	private static void insertionSort(int[] arr) {
		for(int i = 1 ; i < arr.length ; i++) {
			int temp = arr[i];
			int j ;
			for( j = i -1 ; j>=0 && arr[j] > temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array : ");
		n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of array");
		for(int i = 0 ; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		insertionSort(arr);
		System.out.println("Sorted Array is : "+Arrays.toString(arr));
	}


}