public class StoveMachine {
    static void measureWeight(double weight, String unit, String ingredient) {
        System.out.println("Measuring weight: " + weight + " " + unit + " of " + ingredient + " for the stove...");
        if ( weight>0.1)
		{
		System.out.println("weigh machine have proper weight");
		return;
		}
		else
		{
			System.out.println("weigh machine not have  proper weight");	
		}
		}

    static void calculatePrice(String ingredient, double weight, double pricePerUnit)
	{
        double totalPrice = weight * pricePerUnit;
        System.out.println("Calculating price for " + ingredient + " with weight " + weight + " - Total Price: " + totalPrice);
		if(ingredient=="Sugar1")
		{
		System.out.println("ingredient is sugar");
		}
else
		System.out.println("ingredient is not  sugar");
		
    }
    }

    static void displayWeight(String ingredient, double weight, String unit)
	{
        System.out.println("Displaying weight of " + ingredient + ": " + weight + " " + unit);
		String Sugar1="Sugar";
		if(ingredient==Sugar1)
		{
		System.out.println("ingredient is sugar");
		}
else
		System.out.println("ingredient is not  sugar");
		
    }

    static void turnOff()
	{
        System.out.println("Turning off the stove machine...");
    }
}
