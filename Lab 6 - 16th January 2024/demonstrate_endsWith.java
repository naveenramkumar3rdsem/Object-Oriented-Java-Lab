class demonstrate_endsWith
{
	public static void main(String args[])
	{
		String s="Foobar";
		String s1="bar";
		String s2="barr";
		System.out.println(s+" ends with "+s1+"="+s.endsWith(s1));
		System.out.println(s+" ends with "+s2+"="+s.endsWith(s2));
	}
}