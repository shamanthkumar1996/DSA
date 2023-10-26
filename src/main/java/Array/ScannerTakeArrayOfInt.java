package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ScannerTakeArrayOfInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		
		int size=0;
		
		if(sc.hasNextInt()) {
			size = sc.nextInt();
		}
		
		int[] arrInt = new int[size];
		int i=0;
		for(int x : arrInt) {
			
			if(sc.hasNextInt()) {
				arrInt[i] =sc.nextInt();
				i++;
				
			}
		}
		
		System.out.println(arrInt);
		
		//Arrays.sort(arrInt, Collections.reverseOrder());
		
		Arrays.stream(arrInt).max().getAsInt();
		
		Arrays.stream(arrInt).min().getAsInt();
		
		//reserve

	}

}
