package com.dsa.prep;

public class CountTheFrequencyOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		coutFreqChar("shamanth");

	}

	
//	static void coutFreqChar(String str) {
//		
//		int charArray[] = new int[26];
//		
//		for(char x : str.toCharArray()) {
//			
//			charArray[x - 'a']++;
//		}
//		
//		
//		for(int i=0;i<26;i++) {
//			
//			if(charArray[i]!=0) {
//				System.out.print((char) (i + 'a') );
//				System.out.println(" " +charArray[i]);
//			}
//			
//		
//	}
	
	static void coutFreqChar(String str) {
		
		int array[] = new int[26];
		
		for(char x : str.toCharArray()) {
			
			array[x-'a']++;
		}
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]!=0) {
				
				System.out.println((char) (i + 'a'));
				
			}
			
			
		}
		
	}
}
