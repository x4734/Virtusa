package com.galaxy.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomanNumbersServiceImplTest {

	RomanNumbersServiceImpl romanNumbersServiceImpl;

	@Before
	public void init() {
		romanNumbersServiceImpl = new RomanNumbersServiceImpl();
	}

	@Test
	public void romanToArabicCMTest() {
		assertEquals("900", romanNumbersServiceImpl.romanToArabic("CM"));
	}

	@Test
	public void romanToArabicITest() {
		assertEquals("1", romanNumbersServiceImpl.romanToArabic("I"));
	}

	@Test
	public void romanToArabicVTest() {
		assertEquals("5", romanNumbersServiceImpl.romanToArabic("V"));
	}

	@Test
	public void romanToArabicXTest() {
		assertEquals("10", romanNumbersServiceImpl.romanToArabic("X"));
	}

	@Test
	public void romanToArabicLTest() {
		assertEquals("50", romanNumbersServiceImpl.romanToArabic("L"));
	}

	@Test
	public void romanToArabicDTest() {
		assertEquals("500", romanNumbersServiceImpl.romanToArabic("D"));
	}

	@Test
	public void romanToArabicInvalidTest() {
		assertEquals("wrong Roman number, voilated roman number format", romanNumbersServiceImpl.romanToArabic("CM1"));
	}

	@After
	public void cleanUp() {
		romanNumbersServiceImpl = null;
	}

}
