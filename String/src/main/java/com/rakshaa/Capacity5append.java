package com.rakshaa;
public class Capacity5append {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("1234567890123456");
		System.out.println("------->" + sb.capacity());
		
		sb.append("h");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
	}

}
