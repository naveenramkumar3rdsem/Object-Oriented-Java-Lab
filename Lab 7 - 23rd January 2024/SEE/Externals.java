package SEE;
import CIE.Internals;
import java.util.Scanner;
public class Externals extends Internals
{
	protected int marks[]=new int[5];
	protected int finalMarks[]=new int[5];
	public void inputSEEmarks()
	{
		int i;
		Scanner s=new Scanner(System.in);
		for(i=0; i<5; i++)
		{
			System.out.println("Enter the SEE marks for subject p"+(i+1));
			marks[i]=s.nextInt();
		}
	}
	public void calculateFinalMarks()
	{
		int i;
		for(i=0; i<5; i++)
		{
			finalMarks[i]=this.marks[i]/2+super.marks[i];
		}
	}
	public void displayFinalMarks()
	{
		displayStudentDetails();
		int i;
		for(i=0; i<5; i++)
		{
			System.out.println("Final marks of subject "+(i+1)+" is "+finalMarks[i]);
		}
	}
				
}