import java.util.Scanner;
class Subject
{
	int subjectMarks;
	int credits;
	int grade;
}
class Student
{
	int i;
	Subject[] subject=new Subject[9];
	String name;
	String usn;
	float SGPA=0;
	Scanner s=new Scanner(System.in);
	Student()
	{
		for(i=0;i<9;i++)
			subject[i]=new Subject();
	}
	void getStudentDetails()
	{
		System.out.println("Enter the name of the student.");
		this.name=s.nextLine();
		System.out.println("Enter the usn of the student.");
		this.usn=s.nextLine();
	}
	void getMarks()
	{
		for(i=0; i<8 ;i++)
		{
			System.out.println("Enter the marks for subject "+(i+1));
			this.subject[i].subjectMarks=s.nextInt();
			System.out.println("Enter the credits for subject "+(i+1));
			this.subject[i].credits=s.nextInt();
			while(this.subject[i].subjectMarks>100)
			{
				System.out.println("Marks cannot be greater than 100. Enter valid marks.");
				this.subject[i].subjectMarks=s.nextInt();
			}
			if(this.subject[i].subjectMarks==100)
				this.subject[i].grade=10;
			else if(this.subject[i].subjectMarks<40)
				this.subject[i].grade=0;
			else
				this.subject[i].grade=(int)(this.subject[i].subjectMarks/10)+1;
		}
	}
	void computeSGPA()
	{
		int total_credits=0;
		for(i=0;i<8;i++)
		{
			this.SGPA+=this.subject[i].grade*this.subject[i].credits;
			total_credits=total_credits+this.subject[i].credits;
		}
		this.SGPA=this.SGPA/total_credits;
	}
}
class Student_Main
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.getStudentDetails();
		s1.getMarks();
		s1.computeSGPA();
		System.out.println("\n\n"+"Student name : "+s1.name);
		System.out.println("\n"+"Student usn : "+s1.usn);
		System.out.println("\n"+"SGPA of the student : "+s1.SGPA); 
	}	
}