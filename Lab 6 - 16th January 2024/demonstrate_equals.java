class demonstrate_equals
{
	public static void main(String args[])
	{
		String s1="Hello";
		String s2="Hello";
		String s3=new String(s1);
		System.out.println("Literal "+s1+"==Literal "+s2+" is "+(s1==s2));
		System.out.println("Literal "+s1+"==Object "+s3+" is "+(s1==s3));
		System.out.println("Literal "+s1+" Equals Literal "+s2+" is "+s1.equals(s3));
		System.out.println("Literal "+s1+" Equals Object "+s3+" is "+s1.equals(s3));
	}
}