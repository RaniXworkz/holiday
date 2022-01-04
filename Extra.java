class Extra{
static String number[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
   static void printAll()
   {
		for(int index=0;index<number.length;index++)
		{
			System.out.println(number[index]);
			
		}
		System.out.println();
		System.out.println("---------------------------------------------");
	}
		static void myNames(int value,String newName)
		{
			number[value]=newName;
		}	
	static void add(String oldName,String newName)
	{
		for(int index1=0; index1<number.length; index1++)
		{
			if(oldName.equals(number[index1]))
			{
			number[index1]=newName;
			}
		}
	}
}