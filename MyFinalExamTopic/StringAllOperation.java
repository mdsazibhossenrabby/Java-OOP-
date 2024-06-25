package FinalExam;

public class StringAllOperation {
	public static void main(String[] args) {
		
		//Creating(Declare and Initializing ) string
		String firstName="MD";
		String lastName=new String("SAZIB");
		
		System.out.println("First Name  : "+firstName);
		System.out.println("Last Name : "+lastName);
		
		
		//Strings Concatenate,without adding space
		String FullName1=firstName+lastName;
		String FullName2=firstName.concat(lastName);
		
		
		System.out.println("Full Name 1 : "+FullName1);
		System.out.println("Full Name 2 : "+FullName2);
		
		//Find length of String
		int length1=FullName1.length();
		int length2=FullName2.length();
		
		System.out.println("Length of Full Name 1 : "+length1);
		System.out.println("Length of Full Name 2 : "+length2);
		
		//Comparing Strings, case sensitive
		
		boolean equal= firstName.equals(lastName);
		int compare=firstName.compareTo(lastName);
		
		System.out.println("if FirstName and LastName are Equal or Not: "+equal);
		System.out.println("Compare FirstName and LastName : "+compare);
		
		
		//Replacing Specific word or Character
		String mFname= firstName.replace("MD", "MD.");
		String mLname= lastName.replace("AZIB", "azib");
		
		System.out.println("Modified First Name  : "+mFname);
		System.out.println("Modified Last Name : "+mLname);
	}
}
