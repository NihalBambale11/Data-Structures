package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	
	private static void selectionSort(int[] arr) {
		for(int i = 0 ; i < arr.length -1 ;i++) {
			int min = i;
			for(int j = i+1;j<arr.length ; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
			
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
		
		selectionSort(arr);
		System.out.println("Sorted Array is : "+Arrays.toString(arr));
	}


}