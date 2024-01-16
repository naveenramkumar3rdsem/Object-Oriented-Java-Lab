class demonstrate_compareTo
{
	public static void main(String args[])
	{
		String[] s={"van", "watch", "ball", "cat", "xmas", "yatch","zee","apple","ice","jug","kite","lift","man","net","orange","dog","ent","free","gun","hen","parrot","queen","ring","star",
"tree","umbrella"};
		int i;
		int j;
		for(i=0; i<s.length; i++)
		{
			for(j=i; j<s.length; j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					String t=s[j];
					s[j]=s[i];
					s[i]=t;
				}
			}
		}
		for(i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
			