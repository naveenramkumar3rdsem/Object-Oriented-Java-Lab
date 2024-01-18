class demonstrate_getbytes_tocharArray
{
	public static void main(String args[])
	{
		String s="ABCDEF";
		int i;
		byte[] b=s.getBytes();
		for(i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("The string "+s+" is converted to a character array:");\
		for(i=0; i<s.length(); i++)
		{
			System.out.println(s.tocharArray()[i]);
		}

	}
}