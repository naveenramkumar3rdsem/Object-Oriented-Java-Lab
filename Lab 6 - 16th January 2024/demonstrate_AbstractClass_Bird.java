abstract class Bird
{
	abstract void fly();
	abstract void makeSound();
}
class Eagle extends Bird
{
	void fly()
	{
		System.out.println("An eagle flies very high.");
	}
	void makeSound()
	{
		System.out.println("An eagle cries in a high pitch.");
	}
}
class Hawk extends Bird
{
	void fly()
	{
		System.out.println("A hawk flies very high and has sharp eyes.");
	}
	void makeSound()
	{
		System.out.println("A hawk makes a hoarse, screaming sound.");
	}
}
class demonstrate_AbstractClass_Bird
{
	public static void main(String args[])
	{
		Eagle eagle=new Eagle();
		Hawk hawk=new Hawk();
		eagle.fly();
		hawk.fly();
		eagle.makeSound();
		hawk.makeSound();
	}
}