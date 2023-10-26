package Array;

public class RotateArrayKtimesRight {
	
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,6,7};
		
	int[]	array2 = burteForce(array,3);
	
	System.out.println();
		


	}
	
	
	// Brute force approach
	
	
	// in brute force we used extra space
	
	// to avoid extra space we need below steps
	
	// 1st reverse complete array
	
	// 2nd reverse 1st k
	
	// 3rd step reverse n - k 
	
	public static int[] burteForce(int[] array, int k) {
		
		// Important if k is grater than array then k = k % n;
		// create a new space last k elemnts put it in 1st
		
		int[] output = new int[array.length];
		
		int n = array.length - k;
		
		int j =0;
		
		for(int i=n;i<array.length;i++) {
			
				output[j]  = array[i];
				j++;
				
				
		}
		
		for(int i=0;i<=k;i++) {
			
			output[j]  = array[i];
			j++;
			
			
	}
		
		return output;
	
		
		
	}

}
