package com.dsa.prep;

public class StringsDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans = revWord("I love automation");
		
		StringBuffer bf = new StringBuffer("UPPER lower");
		
		StringBuffer oppStr = oppCase(bf);
		
		System.out.println(ans);
		
		System.out.println(oppStr);

	}
	
	
	// Reverse words in a String
	
	
	public static String revWord(String str) {
		
		String s[] = str.split(" ");
		
		String ans = "";
		
		for(int i=s.length-1;i>=0;i--) {
			
			ans += s[i] +" ";
		}
		
		return ans;
		
		
	}
	
	public static StringBuffer oppCase(StringBuffer str) {
		
		for(int i=0;i<str.length();i++) {
			Character c = str.charAt(i);
			
			if(Character.isUpperCase(c)) {
				
				str.replace(i, i + 1,
                        Character.toLowerCase(c) + "");
				
				
			}
			
			else {
				
				str.replace(i, i + 1,
                        Character.toUpperCase(c) + "");
			}
		}
		
		
		return str;
	}

}
