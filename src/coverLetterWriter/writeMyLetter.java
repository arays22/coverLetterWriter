package coverLetterWriter;

public class writeMyLetter extends getUserInput {

	static String name = "";
	static String roleTitle = "";
	static String company = "";
	static String personalCharac = "";
	static String companyValue = "";
	static String keyExperiences = "";
	

	
	public static void main(String[] args) {
		// run program that prints user input 
		getInput();
		name = args[0];
		roleTitle = args[1];
		company = args[2];
		personalCharac = args[3];
		companyValue = args[4];
		keyExperiences = args[5];
	}
}
