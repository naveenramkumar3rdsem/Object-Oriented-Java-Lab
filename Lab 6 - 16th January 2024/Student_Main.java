import java.util.Scanner;
class Student
{
	
	int registration_number;
	String full_name;
	short Semester;
	float CGPA;
	Student()
	{
		this.registration_number=100;
		this.full_name="Naveen Ramkumar";
		this.Semester=3;
		this.CGPA=9.2f;
	}
	Student(int registration_number, String full_name, short Semester, float CGPA)
	{
		this.registration_number=registration_number;
		this.full_name=full_name;
		this.Semester=Semester;
		this.CGPA=CGPA;
	}
	void display(int i)
	{
		System.out.println("Student "+i+" registration number:"+this.registration_number);
		System.out.println("Student "+i+" full name:"+this.full_name);
		System.out.println("Student "+i+" Semester:"+this.Semester);
		System.out.println("Student "+i+" CGPA:"+this.CGPA);
	}
	static void sort_by_CGPA(Student[] arr)
	{
		int i;
		int j;
		Student t;
		for(i=0; i<arr.length; i++)
		{
			for(j=i; j<arr.length; j++)
			{
				if(arr[i].CGPA>arr[j].CGPA)
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
	}
	static void sort_by_Name(Student[] arr)
	{
		int i;
		int j;
		Student t;
		for(i=0; i<arr.length; i++)
		{
			for(j=i; j<arr.length; j++)
			{
				if(arr[i].full_name.compareTo(arr[j].full_name)>0)
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
	}
}
class Student_Main
{
	public static void main(String args[])
	{
		Student s1[]=new Student[5];
		int i;
		int registration_number;
		String full_name;
		short Semester;
		float CGPA;
		Scanner s=new Scanner(System.in);
		for(i=0; i<5; i++)
		{
			System.out.println("Enter the registration number of student "+(i+1));
			registration_number=s.nextInt();
			s.nextLine();
			System.out.println("Enter the full name of the student "+(i+1));
			full_name=s.nextLine();
			System.out.println("Enter the semester of the student "+(i+1));
			Semester=s.nextShort();
			System.out.println("Enter the CGPA of the student "+(i+1));
			CGPA=s.nextFloat();
			s1[i]=new Student(registration_number, full_name, Semester, CGPA);
		}
		System.out.println("\n\nThe student records are");
		for(i=0; i<5; i++)
		{
			s1[i].display(i+1);
			System.out.println("\n");
		}
		Student.sort_by_CGPA(s1);
		System.out.println("\n\nThe student records after sorting them by CGPA are");
		for(i=0; i<5; i++)
		{
			s1[i].display(i+1);
			System.out.println("\n");
		}
		Student.sort_by_Name(s1);
		System.out.println("\n\nThe student records after sorting them by name are");
		for(i=0; i<5; i++)
		{
			s1[i].display(i+1);
			System.out.println("\n");
		}
	}
}
				
		

		
		
		





