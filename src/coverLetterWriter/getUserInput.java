package coverLetterWriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class getUserInput  {

	static String cover = "Dear [name] I’m writing in response to your recently advertised "
			+ "position for a [role title]. I am very interested in this opportunity with "
			+ "[company] and believe that my qualifications, education and professional "
			+ "experience would make me a strong candidate for the position.I am a "
			+ "[insert personal characteristics] professional who [value to company]. (You can insert short "
			+ "version of your career profile here).Enclosed is my resume "
			+ "that more fully details my background and work experience, and "
			+ "how they relate to your position. As you can see, [key experiences].I firmly believe that I can "
			+ "be a valuable asset to your team. I welcome the opportunity "
			+ "to speak with you about this position and how my experience "
			+ "could help [insert name of company] achieve its goals.Thank you in "
			+ "advance for your consideration.Kind regards,[Your name]";
	
	public static void getInput() throws IOException {
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
	}
	
	public static String printCoverLetter(String name, String roleTitle, String company,
			String personalCharac, String companyValue, String keyExperiences) {
		cover.replace("[name]", name);
		cover.replace("[role title]", roleTitle);
		cover.replace("[company]", company);
		cover.replace("[insert personal characteristics]", personalCharac);
		cover.replace("[value to company]", companyValue);
		cover.replace("[key experiences]", keyExperiences);
		
		return cover;
		
		
	}
}
