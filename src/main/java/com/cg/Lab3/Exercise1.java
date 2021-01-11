/**
 * 
 * @author - L.S.Kanishka
 * Write a Java program that reads a line of integers and 
 * then displays each integer and the sum of all integers.
 */

package com.cg.Lab3;

import java.util.Arrays;

public class Exercise1 {

	public int calculate(String input) {
		if(input.isEmpty()) {
			return 0;
		} 		
		else {
			return Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).sum();
		}
	}

}
