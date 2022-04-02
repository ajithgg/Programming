package com.java.practice;

public class MaxSum {
	
	public static void main(String[] args) {
		
		int arr[]= {100, 200, 300, 400};
		int n=arr.length;
		int k=2;
		
		
		System.out.println(maxSum(arr,n, k));
	}

	private static int maxSum(int[] arr, int n, int k) {

		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int curr_sum = 0;
			for (int j = 0; j < k; j++) {
				curr_sum = arr[j] + arr[j + 1];
			}

			maxSum = Math.max(maxSum, curr_sum);

		}
		return maxSum;
	}

}
