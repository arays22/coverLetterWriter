package coverLetterWriter;

import java.io.IOException;

public class writeMyLetter extends getUserInput {

	static String name = "";
	static String roleTitle = "";
	static String company = "";
	static String personalCharac = "";
	static String companyValue = "";
	static String keyExperiences = "";
	

	
	public static void main(String[] args) throws IOException {
		// run program that prints user input 
		getInput();
		System.out.println(printCoverLetter(args[0], args[1], args[2], args[3], args[4], args[5]));
	}
}
