package coverLetterWriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class writeMyLetter extends getUserInput {

	
	public static void main(String[] args) throws IOException {
		// run program that prints user input 
		System.out.println("What is your name?");
		BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
		String userName = name.readLine();
		System.out.println("What role are you applying for?");
		BufferedReader role = new BufferedReader(new InputStreamReader(System.in));
		String userRole = role.readLine();
		System.out.println("What company are you applying to?");
		BufferedReader company = new BufferedReader(new InputStreamReader(System.in));
		String companyName = company.readLine();
		System.out.println("What are three characteristics that describe you?");
		BufferedReader charac = new BufferedReader(new InputStreamReader(System.in));
		String userCharac = charac.readLine();
		System.out.println("What value can you add to the company?");
		BufferedReader value = new BufferedReader(new InputStreamReader(System.in));
		String userValue = value.readLine();
		System.out.println("What is one project on your resume that aligns with the"
				+ "requirements of the advertised role?");
		BufferedReader project = new BufferedReader(new InputStreamReader(System.in));
		String userProject = project.readLine();
		System.out.println(printCoverLetter(userName, userRole, companyName, userCharac, userValue, userProject));
	}
}
