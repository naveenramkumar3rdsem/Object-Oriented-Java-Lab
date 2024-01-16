class demonstrate_getchars
{
	public static void main(String args[])
	{
		String s="Welcome to Bmsce college";
		int start=11;
		int end=16;
		char buf[]=new char[end-start];
		s.getChars(start, end, buf, 0);
		System.out.println(buf);
	}
}