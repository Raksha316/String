package com.rakshaa;
public class Capacity4 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(40);
		System.out.println(sb.capacity());
		
	}

}
