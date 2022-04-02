package com.java.practice;

public class RotateArray {

	// Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 1;
		int n = 7;

		RotateArray arry = new RotateArray();
		arry.leftRotate(arr, d, n);

		arry.printArray(arr);

	}

	void printArray(int[] a) {
		for (int j = 0; j < a.length; j++)
			System.out.print(a[j] + " ---> ");
	}

	void leftRotate(int[] a, int d, int n) {
		for (int i = 0; i < d; i++) {
			leftRotateByOne(a, n);
		}
	}

	private void leftRotateByOne(int[] a, int n) {
		int i, temp;

		temp = a[0];

		for (i = 0; i < n - 1; i++) {
			a[i] = a[i + 1];
		}
		a[n - 1] = temp;

	}

}
