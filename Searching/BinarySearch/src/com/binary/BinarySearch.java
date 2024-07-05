package com.binary;

public class BinarySearch {

	public int binarySearch(int[] arr, int find) {
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == find) {
				return mid;
			} else if (arr[mid] > find) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return -1;
	}

}
