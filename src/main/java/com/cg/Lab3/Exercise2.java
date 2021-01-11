package com.cg.Lab3;

/**
 * Mirror of String
 * author- L.S.kanishka
 *
 */
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		System.out.print(s+"|"+Image(s));
		
	}

	private static String Image(String s) {
		// TODO Auto-generated method stub
		StringBuffer sc=new StringBuffer(s);
		sc=sc.reverse();
		String s2=sc.toString();
		s2=s2.toUpperCase();
		
		return s2;
	}
	

}
