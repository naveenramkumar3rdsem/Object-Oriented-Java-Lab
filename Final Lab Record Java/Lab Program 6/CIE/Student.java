package CIE;
import java.util.Scanner;
public class Student
{
	protected String usn=new String();
	protected String name=new String();
	protected int sem;
	public void inputStudentDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the usn of the student.");
		usn=s.nextLine();
		System.out.println("Enter the name of the student.");
		name=s.nextLine();
		System.out.println("Enter the semester of the student.");
		sem=s.nextInt();
	}
	public void displayStudentDetails()
	{
		System.out.println("The Student's usn is "+usn);
		System.out.println("The Student's name is "+name);
		System.out.println("The Student's semester is "+sem);
	}
}
	
