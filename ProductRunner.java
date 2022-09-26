class ProductRunner
{
	public static void main (String[] item)
	{
		  System.out.println("Running main method");
		  String name = item[0];
		  String type = item [1];
		  String price = item[2];
		  String quantity = item[3];
		  String quality = item[4];
		  
		  if (item.length==5)
		  {
		 
		    System.out.println("Product name is :"+ name);
		  
		    System.out.println("Product type is :"+ type);
		  
		    double convertedPrice = Double.parseDouble(price);
		    System.out.println("Converted price :"+ convertedPrice);
		  
		    int convertedQuantity = Integer.parseInt(quantity); 
		    System.out.println("Converted quantity : "+ convertedQuantity);
		 
		    System.out.println("Product Quality :"+ quality);
			
			 double totalPrice = convertedPrice * convertedQuantity;
		     System.out.println("Total price is :"+ totalPrice);
		  }
		  
		  else
		  {
			  System.out.println("dont run main method");
		  }
		  
	}
}