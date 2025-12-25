package com.rakshaa;
import java.util.Arrays;
public class Anagram {
	public static void main(String[] args) {
		
		String str1 = "School Master";
		String str2 = "The Classroom";
		
		//step:-01 [ remove the space ]
		
		str1 = str1.replace(" ", "");   //SchoolMaster
		str2 = str2.replace(" ", "");   //TheClassroom
		
		//step:-02 [upper case, lower case]
		
		str1 = str1.toLowerCase();     //schoolmaster
		str2 = str2.toLowerCase();     //theclassroom
		
		//step:-03 [convert it into char array]
		
		char ar1[] = str1.toCharArray();
		char ar2[] = str2.toCharArray();
		
		//step:-04 [shorting]
		 
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		//step:-05 [check both string anagram or not]
		
		if(Arrays.equals(ar1, ar2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}

}
