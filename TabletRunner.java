class TabletRunner
{
	public static void main(String[] tab)
	{
		System.out.println("Running main method");
		
		Tablet.printProperties();
		
		Tablet.type = "Cold";
		Tablet.color = 6;
		Tablet.size = 's';
		Tablet.price = 6;
		Tablet.height = 2.3;
		Tablet.width = 0.23;
		Tablet.shape = "Round";
		Tablet.capacity = 450;
		Tablet.wiegth = 0.25;
		Tablet.withCover = true;
		Tablet.tabCode = 2762918742l;
		Tablet.isSafe = true;
		Tablet.suggest = "Physist";
		Tablet.whenToTake = "Night";
		Tablet.taste = "Bitter";
		Tablet.whoToTake = "Kids";
		Tablet.byTwo = true;
		
		String[] paint = {"Red", "Green", "Yellow"};
		Tablet.colors = paint;
		
		String[] name = {"Actoin cold", "Vics Actio 500", };
		Tablet.names = name;
		
		String[] use = {"Akash", "Bharath", "Manvita"};
		Tablet.users = use;
		
		String[] parts = {"Chemicals", "water"};
		Tablet.ingredients = parts;
		
		double[] quant = {250,200,175,362};
		Tablet.quantities = quant;
		
		String[] factory = {"Bharath Chemicals", "Indian Chemicals"};
		Tablet.companies = factory;
		
		String[] location = {"Bangalore", "Mysore", "Dharwad"};
		Tablet.places = location;
		
		boolean[] prob = {true, true, false};
		Tablet.cure = prob;
		
		String[] store = {"Medical shop", "Hospital", "Generals"};
		Tablet.availability = store;
		
		String[] avail = {"Tablet", "Syrup"};
		Tablet.forms = avail;
		
		Tablet.printProperties();
		

	}
}