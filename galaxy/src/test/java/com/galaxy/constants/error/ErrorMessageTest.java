package com.galaxy.constants.error;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ErrorMessageTest {

	ErrorMessage errorMessage;

	@Before
	public void init() {
		errorMessage = new ErrorMessage();
	}
	
	@Test
	public void getMessageTest() {
		assertEquals("No input was specified ! Program exited", errorMessage.getMessage(ErrorCodes.NO_INPUT));
		assertEquals("Input format is wrong ! input discarded", errorMessage.getMessage(ErrorCodes.INVALID));
		assertEquals("Illegal character specified in roman number ! input discarded", errorMessage.getMessage(ErrorCodes.INVALID_ROMAN_CHARACTER));
		assertEquals("wrong Roman number, voilated roman number format", errorMessage.getMessage(ErrorCodes.INVALID_ROMAN_STRING));
		assertEquals("Exception caused during processing due to incorrect line type supplied", errorMessage.getMessage(ErrorCodes.INCORRECT_LINE_TYPE));
		assertEquals("I have no idea what you are talking about", errorMessage.getMessage(ErrorCodes.NO_IDEA));
		assertEquals(null, errorMessage.getMessage(ErrorCodes.SUCCESS_OK));
	
	}
	
	@After
	public void cleanUp() {
		errorMessage = null;
	}

}
