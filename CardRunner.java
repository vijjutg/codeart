class CardRunner
{
	public static void main(String[] cards)
	{
		System.out.println("Running main method");
		Card.displayDetails();
		
		Card.type = "Credit card";
		Card.height = 12.3;
		Card.width = 3.7;
		Card.price = 450;
		String[] paints ={"White", "Red", "Green", "Pink"};
		Card.colors = paints;
		
		Card.displayDetails();

	}
}