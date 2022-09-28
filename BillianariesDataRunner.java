class BillianariesDataRunner
{
	public static void main (String[] args)
	{
		System.out.println("main : Started");
		
		BillianariesDataOperator.save("Elon Musk");
		
		BillianariesDataOperator.save("Bernard Arnault");
		
		BillianariesDataOperator.save("Gautham Adani");
		
		BillianariesDataOperator.save("Jeff Bezos");
		
		BillianariesDataOperator.save("Bill Gates");
		
		BillianariesDataOperator.save("Warren Buffet");
		
		BillianariesDataOperator.save("Larry Ellison");
		
		BillianariesDataOperator.save("Larry Page");
		
		BillianariesDataOperator.save("Mukesh Ambani");
		
		BillianariesDataOperator.save("Sergey Brin");
		
		BillianariesDataOperator.save("Steve Ballmer");
		
		BillianariesDataOperator.displayDetails();
		
		boolean found = BillianariesDataOperator.find("Mukesh Ambani");
		System.out.println("Name found : "+ found);
		
		String name = BillianariesDataOperator.upDate("Bill Gates" , "Steve Ballmer");
		System.out.println("Updated name is :" + name);
		
		String newWord = BillianariesDataOperator.upDate(4 , "Narayana Murti");
	    System.out.println("updated name is : "+ newWord + " at index : "+ "4");
		
		boolean deleted = BillianariesDataOperator.delete("Jeff Bezos");
		System.out.println("name is deleted : "+ deleted);
		
		boolean deleteByIndex = BillianariesDataOperator.delete(1, "Elon Musk");
		System.out.println("is the name deleted : "+ deleteByIndex);
		
		BillianariesDataOperator.displayDetails();
		
		System.out.println("main : Ended");
	}
}