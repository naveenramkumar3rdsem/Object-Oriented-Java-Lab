class demonstrate_compareTo_numbers
{
	public static void main(String args[])
	{
		String arr[]={"7", "6", "2", "9", "3", "4", "1", "8", "5"};
		int i=5;
		int j=5;
		for(i=0; i<arr.length; i++)
		{
			for(j=i; j<arr.length; j++)
			{
				if(arr[i].compareTo(arr[j])<0)
				{
					String t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;
				}
			}
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}