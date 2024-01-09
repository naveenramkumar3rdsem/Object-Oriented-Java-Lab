
import java.util.Scanner;
class Books
{
	String name;
	String author;
	int price;
	int numPages;
	Books(String name, String author, int price, int numPages)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.numPages=numPages;
	}
	public String toString()
	{
		String name,author,price,numPages;
		name="Book Name: "+this.name+"\n";
		author="Author Name: "+this.author+"\n";
		price="Book Price: "+this.price+"\n";
		numPages="Number of Pages: "+this.numPages+"\n";
		return(name+author+price+numPages);
	}
}
class Books_Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		String name;
		String author;
		int price;
		int numPages;
		int i;
		System.out.println("Enter the number of books to be entered.");
		n=s.nextInt();
		s.nextLine();
		Books[] b=new Books[n];
		System.out.println("\n");
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the name of the book "+(i+1));
			name=s.nextLine();
			System.out.println("Enter the name of the author of the book "+(i+1));
			author=s.nextLine();
			System.out.println("Enter the price of the book "+(i+1));
			price=s.nextInt();
			System.out.println("Enter the number of pages in the book "+(i+1));
			numPages=s.nextInt();
			s.nextLine();
			b[i]=new Books(name,author,price,numPages);
			System.out.println("\n");
		}
		System.out.println("\n"+"The Book details are:"+"\n\n");
		for(i=0;i<n;i++)
		{
			System.out.println(b[i].toString()+"\n\n");
		}
	}
}

