package qtwotech;

import java.util.Scanner;

public class test1 {
	
	// Vowels
	// two arrays similar value need to return
	//write a array based on index return values like (0,3)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	String output = 	vowel();
//	
//	System.out.println(output);
	
	// problem 2
	
	System.out.println(" problem 2");
	int[] op = twoSimilararray();
	
	
	
	for(int i=0;i<op.length;i++) {
		
		
		
		System.out.println("Similar value " +op[i]);
	}
	
	// problem 3
	
//	String output3 = returnarraywithIndex();
////	
//	System.out.println("Problem 3");
//	
//	System.out.println(output3);
	
	}
	
	public static String vowel() {
		
	Scanner sc = new Scanner(System.in);
		
	//String s1 =  sc.next();
	
	String s1 = sc.nextLine();
	
	char[] intput = s1.toCharArray();
	
	char[] output = new char[s1.length()];
	
	int index =0;
	
	
	for(int i=0;i<intput.length;i++) {
		
		if(intput[i] == 'a'|| intput[i] == 'e'  ||intput[i] == 'i'
				|| intput[i] == 'o' || intput[i] == 'u') {
			
			
			output[index] = intput[i];
			index++;
			
			//return "String contains vowels";
		}
		
		
		
	}
	
	if(index==0) {
		return " No vowels";
	}
	
	for(int i=0;i<index;i++) {
		
		System.out.println(output[i]);
	}
	
	
	return "Vowels present";
	

	}
	
	public static int[] twoSimilararray() {
		
		int[] array1 = new int[5];
		
		
		int[] array2 =  new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);
		
		
		
		
		
		
		
		for(int i=0;i<5;i++) {
			
			
			
			array1[i] = sc.nextInt();
			
			
		}
		
		for(int i=0;i<5;i++) {
			
			
			
			array2[i] = sc.nextInt();
			
			
		}
		
			
			
	
		
		
		
		int[] output = new int[array2.length];
		
		int x =0;
		for(int i=0;i<array1.length;i++) {
			
			for(int j=0;j<array2.length;j++) {
				
				if(array1[i]==array2[j]) {
					
					output[x] = array1[i];
					x++;
				}
			}
		}
		
		for(int i=0;i<x;i++) {
			
			
			
			System.out.println("Similar value " +output[i]);
		}
		
		return output;
		
		
		
		
	}
	
	
	public static String returnarraywithIndex() {
		
		
		Scanner sc = new Scanner(System.in);
			
		String s1 =  sc.next();
		
		
		Scanner sc2 = new Scanner(System.in);
		
		int start = sc2.nextInt();
		
		int end = sc2.nextInt();
		
		String outPut = s1.substring(start, end);
		
		return outPut;
		
	
		
		
		
		
		
	}

}
