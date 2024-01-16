class demonstrate_startsWith
{
	public static void main(String args[])
	{
		String s="Foobar";
		String s1="Foo";
		String s2="Fooo";
		System.out.println(s+" begins with "+s1+"="+s.startsWith(s1));
		System.out.println(s+" begins with "+s2+"="+s.startsWith(s2));
	}
}