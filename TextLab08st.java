// TextLab08st.java
// This is the student, starting file for the TextLab08 assignment.


import java.util.Scanner;


public class TextLab08st
{
	public static void main(String args[])
	{
		System.out.println("TextLab08\n\n");
		FullName fn = new FullName();
		System.out.println("\nFirst Name First: " + fn.firstNameFirst());
		System.out.println("\nLast  Name First: " + fn.lastNameFirst());
		System.out.println();
	}
}

class FullName
{
	String name;

	public FullName()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your full name, first name first.  -->  ");
		name = input.nextLine();
	}

	public String firstNameFirst()
	{
		return name;
	}

	public String lastNameFirst()
	{
		int spaceIndex1 = name.indexOf(" ");
		int spaceIndex2 = name.lastIndexOf(" ");
		String firstName = name.substring(0, spaceIndex1);
		String middleName = name.substring(spaceIndex1,spaceIndex2);
		String lastName = name.substring(spaceIndex2);
		return lastName+" "+middleName+" "+firstName;
	}
}

