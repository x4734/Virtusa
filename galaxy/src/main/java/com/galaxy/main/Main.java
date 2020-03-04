package com.galaxy.main;

import java.util.ArrayList;

import com.galaxy.common.util.Utility;
import com.galaxy.constants.validate.GalaxyValidate;

/**
 * Galaxy Project!
 *
 */
public class Main {
	public static void main(String[] args) {
		Utility.println("Welcome to GalaxyMerchant ! please provide input below and a blank new line to finish input");

		// Initialize a new paragraph
		GalaxyValidate paragraph = new GalaxyValidate();

		// Read the input from console, validate and process
		/*====================================================================================
		Run the application and paste below test input in console/terminal 
		and then press the enter button two time you will get output
		-------------------------------------------
glob is I
prok is V
pish is X
tegj is L
glob glob Silver is 34 Credits
glob prok Gold is 57800 Credits
pish pish Iron is 3910 Credits
how much is pish tegj glob glob ?
how many Credits is glob prok Silver ?
how many Credits is glob prok Gold ?
how many Credits is glob prok Iron ?
how much wood could a woodchuck chuck if a woodchuck could chuck wood ?

        --------------------------------------------
Outout:-   
pish tegj glob glob is 42
glob prok Silver is 68 Credits
glob prok Gold is 57800 Credits
glob prok Iron is 782 Credits
I have no idea what you are talking about
		====================================================================================== */
		ArrayList<String> output = paragraph.read();

		for (int i = 0; i < output.size(); i++) {
			Utility.println(output.get(i)); 
		}

	}
}
