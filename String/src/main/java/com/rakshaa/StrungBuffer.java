package com.rakshaa;
public class StrungBuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Prasoon");
		StringBuffer sb2 = new StringBuffer("Prasoon");
		StringBuffer sb3 = new StringBuffer("Prasoon");
		StringBuffer sb4 = new StringBuffer("Prasoon");

		
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(sb3));
		System.out.println(sb1.equals(sb4));
		System.out.println(sb2.equals(sb3));
		System.out.println(sb2.equals(sb4));
		
		System.out.println("========================");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1==sb3);
		System.out.println(sb1==sb4);
		System.out.println(sb2==sb3);
		System.out.println(sb2==sb4);
		

}
}