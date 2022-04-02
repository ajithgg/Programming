package com.java.practice;

public class CyclicRotate {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int n=5;
		
		int temp=a[n-1];
		
		for(int j=n-1;j>0;j--)
		{
			a[j]=a[j-1];
		}
		
		a[0]=temp;
		
		printArray(a);
	}
	
	static void printArray(int[] a) {
		for (int j = 0; j < a.length; j++)
			System.out.print(a[j] + " ---> ");
	}

}
