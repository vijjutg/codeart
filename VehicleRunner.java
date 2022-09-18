class VehicleRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main method");
		double distance = Vehicle.transport("Kudligi","Bangalore");
		System.out.println(distance);
		
		double totalDist = Vehicle.transport("Mysore","Mandya",true);
		System.out.println(totalDist);
		
		boolean dest = Vehicle.transport("Udupi");
		System.out.println(dest);
		
		boolean reached = Vehicle.transport("Delhi", false);
		System.out.println(reached);
		
		boolean time = Vehicle.transport(true);
		System.out.println(time);
	}
}