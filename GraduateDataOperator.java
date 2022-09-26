class GraduateDataOperator
{
	static String[] namesOfGraduate = {null,null,null,null,null};
	
	static int index = 0;
	
	static void save(String graduateName)
	{
		namesOfGraduate[index] = graduateName;
		System.out.println("Name of graduate Name at index " + index + " is : " + graduateName);
		index++;
		System.out.println("next index available is : "+ index);
	}
	
	static void displayDetails()
	{
		for (int pos=0; pos<namesOfGraduate.length; pos++)
		{
			String ref = namesOfGraduate[pos];
			System.out.println("Name is : "+ ref);
		}
	}
}