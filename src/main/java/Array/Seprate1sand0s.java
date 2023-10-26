package Array;

import java.util.Scanner;

public class Seprate1sand0s {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner arrayInt = new Scanner(System.in);
		
		System.out.println("Enter array length");
		
		
		
		
		int size = arrayInt.nextInt();
		
		int[] array1 = new int[size];
		
		for(int i=0;i<size;i++) {
			
			array1[i] = arrayInt.nextInt();
			
			
		}
		
		int left =0; int right = size-1;
		
		
		while(left <= right) {
			
			if(array1[left]==1) {
				
				int temp = array1[left];
				
				array1[left] = array1[right];
				
				array1[right] = temp;
				
				right--;
			}
			
			else {
				
				left ++;
			}
			
			
		}
		
		int k=0;
		
		while(k<size) {
		
		System.out.println(array1[k]);
		
		k++;
		
		}

	}

}
