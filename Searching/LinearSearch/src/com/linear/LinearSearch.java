package com.linear;

public class LinearSearch {

	public int linearSearch(int[] arr, int find) {
		for(int i = 0 ; i < arr.length; i++ ) {
			if(find == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
}
