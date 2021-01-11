package com.cg.Lab3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

public class Exercise1Test {
	private Exercise1 exe;
	private static String ANY_SINGLE_NUMBER_AS_STRING = "300";
	private static int EXPECTED_SINGLE_NUMBER_AS_INTEGER = 300;

	@Before
	public void setup() {
		exe=new Exercise1();
	}
	@Test
	public void testCalculate_GivenEmptyString_ShouldReturn0AsInteger() {
		int result = exe.calculate("");
		assertEquals(0, result);
	}
	
	@Test
	public void testCalculate_Given1AsString_ShouldReturn1AsInteger() {
		int result = exe.calculate(ANY_SINGLE_NUMBER_AS_STRING);
		assertEquals(EXPECTED_SINGLE_NUMBER_AS_INTEGER, result);
	}
	@Test
	public void testCalculate_Given1AND2AsStringSeparedByComma_ShouldReturn3AsInteger() {
		int result = exe.calculate("1,2");
		assertEquals(3, result);
	}
	
	@Test
	public void testCalculate_Given1AND2And3AsStringSeparedByComma_ShouldReturn6AsInteger() {
		int result = exe.calculate("4,7,1");
		assertEquals(12, result);
	}

}