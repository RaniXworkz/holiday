class TraineeDetails{
   static String names[]={"Rani","Deepa","Raji","Laxmi","Shweta","Muskan","Nisarga","Manjula","Pooja","Radhika","Naveen","Rana","Ullas","Sheetal","Bharath","Anita","Harshith","Santosh","Mahesh","Umesh","Shankar"};
   static void printAll()
   {
for(int index=0;index<names.length;index++)
{
	System.out.println(names[index]+"\t");
}
System.out.println();
}
static void Names(String oldName,String newName)
{
	for (int index=0;index<names.length;index++)
	{
		if(oldName.equals(names[index]))
		{
			names[index]=newName;
		}
	}
}
}
