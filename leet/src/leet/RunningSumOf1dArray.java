package leet;

import java.util.Scanner;

public class RunningSumOf1dArray {

	public static void main(String[] args) {
		
		// https://leetcode.com/problems/running-sum-of-1d-array/
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[4];
		
		for(int i = 0; i < nums.length; i++) {

			System.out.print("정수 입력 : ");
			nums[i] = sc.nextInt();
		}
		
		System.out.print("[");
        for(int j = 0; j < nums.length; j++) {        	
        	System.out.print(nums[j] + " ");
        }
        System.out.println("]");
				
        int[] result = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            
            if(i == 0) {
            	result[i] = nums[i];
            } else {
            	result[i] = result[i-1] + nums[i];
            }
            
        }
        
        System.out.print("[");
        for(int j = 0; j < result.length; j++) {        	
        	System.out.print(result[j] + " ");
        }
        System.out.print("]");

	}

}
