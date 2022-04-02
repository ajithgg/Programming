package com.java.practice;

import java.util.Arrays;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int[] nums= {1,3,5,7,9}; 
		int target=8;
		twoSum(nums,target);
		
	}

	private static void twoSum(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;

		int[] res = new int[2];

		while (start < end) {
			int sum = nums[start] + nums[end];

			if (sum == target) {
				res[0] = start + 1;
				res[1] = end + 1;
				break;
			} else if (sum < target) {
				start++;
			} else {
				end--;
			}
		}

		System.out.println(Arrays.toString(res));
	}

}
