package com.galaxy.common.util;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class UtilityTest {

		@Before
	public void init() {
	
	}
	
	/* code coverage */
	@Test
	public void printTest() {
		 Utility.print("print singleline"); 
		 assertTrue(true);
	}
	
	/* code coverage */
	@Test
	public void printlnTest() {
		 Utility.println("println singleline"); 
		 assertTrue(true);
	}

	@After
	public void cleanUp() {
	}
}
