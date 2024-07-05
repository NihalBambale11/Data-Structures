package com.binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BinarySearch b = new BinarySearch();		
		System.out.print("Enter the size of array : ");
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		System.out.println("Enter the element of Array");
		for(int i = 0 ; i < n ; i++) {
			arr[i]  = scan.nextInt();
		}
		
		System.out.println("Enter the Element you want to Search : ");
		int find = scan.nextInt();
		Arrays.sort(arr);
		int pos = b.binarySearch(arr,find);
		
		if(pos == -1) {
			System.out.println("Element Not Found ");
		}
		else {
			System.out.println("Element Found At index " +pos+" And position "+(pos+1));
		}
	}
}
