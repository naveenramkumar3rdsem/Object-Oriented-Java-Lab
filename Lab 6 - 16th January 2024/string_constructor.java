class string_constructor
{
	public static void main(String args[])
	{
		char chars[]={'J', 'a', 'v', 'a'}
		byte asciiChars[]={65, 66, 67, 68, 69, 70};
		String s=new String();
		String s1=new String(chars);
		String s2=new String(chars, 1, 3);
		String s3=new String(s1);
		String s4=new String(asciiChars);
		String s5=new String(asciiChars, 2, 3);
		System.out.println("s="+s+", s1="+s1+", s2="+s2+", s3="+s3+", s4="+s4+", s5="+s5);		
	}
}