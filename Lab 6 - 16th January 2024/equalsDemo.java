class equalsDemo
{
	public static void main(String args[])
	{
		String s1="Bmsce";
		String s2="College";
		String s3="BMSCE";
		System.out.println("Bmsce equals Bmsce -> "+s1.equals(s1));
		System.out.println("Bmsce equals College -> "+s1.equals(s2));
		System.out.println("Bmsce equals BMSCE -> "+s1.equals(s3));
		System.out.println("Bmsce equalsIgnoreCase BMSCE -> "+s1.equalsIgnoreCase(s3));
	}
}