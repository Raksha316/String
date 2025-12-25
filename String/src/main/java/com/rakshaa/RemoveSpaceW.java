package com.rakshaa;
public class RemoveSpaceW {
	public static void main(String[] args) {
		
		String s = "Prasoon Java";
		String emptyString = "";
		
		//step:-01 find the length of the given string use length() method
		
		int n = s.length();
		System.out.println(n);
		
		//step:- 02 
		
		for(int i=0; i<n; i++) {
			char ch = s.charAt(i);
			
			if(ch != ' ') {
				emptyString = emptyString + ch;
			}
		}
		System.out.println(emptyString);
	}

}
