package com.dsa.prep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoPointerApproach {

	public static void main(String[] args) {
		
		int[] test = {1,5,6,8,9,10};
		
		int target = 6;
		
		int[] ans = twoSum(test,target);
		
		//System.out.println(ans[0] +" "+ ans[1]);
		
		 int[] a1 = new int[] {-1, 5, 10, 20, 28, 3};
		    int[] a2 = new int[] {26, 134, 135, 15, 17};

		    int[] pair = findSmallestDifferencePair(a1, a2);
		   // System.out.println(pair[0] + " " + pair[1]);
		    
		    
		    int[] nums = new int[] { 1, 1, 1, 3, 5, 5, 7 };
		    
		    int[] newNum = removeDuplicates(nums);
		    
		    for (int i = 0; i < newNum.length; i++) {
		       // System.out.print(newNum[i] + " ");
		      }
		    
		    
		    int[] nums2 = new int[] { 1, 1, 1, 3, 5, 5, 7 };
		    int newLength = removeDuplicates2(nums);

		    System.out.println("Length of array after removing duplicates = " + newLength);

		    System.out.print("Array = ");
		    for (int i = 0; i < newLength; i++) {
		      System.out.print(nums[i] + " ");
		    }
		   

	}
	
	
	static int[] twoSum(int[] num, int target) {
		
		int size = num.length;
		
		Map<Integer,Integer> keys = new HashMap<>();
		
		
		for(int i=0;i<size;i++) {
			
			// b = target -a;
			
			int x = target - num[i];
			
			if(keys.containsKey(x)) {
				
				return new int[] {num[i], x};
			}
			
			else {
				keys.put(num[i], i);
			}
		}
		
		return new int [] {};
	}
	
	//Easy approach is to just take two for loop and iterate each elements
	//Below approach we sort the elemets 1st then we have one while loop to iterate
	
	public static int[] findSmallestDifferencePair(int[] a1, int[] a2) {
	    Arrays.sort(a1);
	    Arrays.sort(a2);

	    double smallestDiff = Double.MAX_VALUE;
	    int[] smallestDiffPair = new int[2];
	    int i = 0, j = 0;

	    while(i < a1.length && j < a2.length) {
	      double currentDiff = Math.abs(a1[i] - a2[j]);
	      if(currentDiff < smallestDiff) {
	        smallestDiff = currentDiff;
	        smallestDiffPair[0] = a1[i];
	        smallestDiffPair[1] = a2[j];
	      }
	      
	      //Logic to increment
	      if(a1[i] < a2[j]) {
	        i++;
	      } else {
	        j++;
	      }
	    }
	    return smallestDiffPair;
	  }
	
	
	// Remove duplicate in a sorted array
	
	private static int[] removeDuplicates(int[] nums) {
		
		int size = nums.length;
		int[] newNum = new int[size];
		
		// This will increment only when we do not find a duplicate
		int j=0;
		
		for(int i=0;i<size-1;i++) {
			
			if(nums[i]==nums[i+1]) {
				continue;
				
			}
			
			if(i+1==size-1) {
				newNum[j++] = nums[i];
				newNum[j++] = nums[i+1];
			}
			else {
				newNum[j++] = nums[i];
			}
			
			
			
			
			
		}
		return newNum;
	}
	
	/*Remove duplicates in a sorted array such that it can appear max twice
	 * Make sure you do not use extra array
	 * 
	 */
	
	// logic is since array is sorted use 1 plus 1+2 approach and 
	//then keep the count so we do not use extra array
	
	 private static int removeDuplicates2(int[] nums) {
		 
		 int size = nums.length;
		 
		 int j = 0;
		 
		 for(int i=0;i<size-2;i++) {
			 
			 
			 if(nums[i] == nums[i+2]) {
				 continue;
			 }
			 
			 if(i+2 == size-1) {
				 
				 nums[j++] = nums[i];
				 nums[j++] = nums[i+2];
			 }
			 else {
				 nums[j++] = nums[i];
			 }
		 }
		 
		 // Imp to use same array we are returning count;
		 return j;
	 }

	  

}
