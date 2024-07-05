package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	
	private static void bubbleSort(int[] arr) {
		for(int i = 0 ; i < arr.length-1; i++ ) {
			boolean flag = false;
			for(int j = 0 ; j < arr.length-1-i ; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if(!flag) {
				break;
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
		
		bubbleSort(arr);
		System.out.println("Sorted Array is : "+Arrays.toString(arr));
	}


}