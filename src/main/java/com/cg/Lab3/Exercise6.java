package com.cg.Lab3;

/**
 * Positive String
 * author-L.S.Kanishka
 *
 */
public class Exercise6 {

	public static void main(String[] args) {
		
		String s="ANT";
		 System.out.print(sortPositive(s));
		
		

	}

	private static boolean sortPositive(String s) 
	{
		// TODO Auto-generated method stub
		char[] c=s.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i]>c[i+1])
			{
				return false;
			}
		}
		return true;
	}
		

}
