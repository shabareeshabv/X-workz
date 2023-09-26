public class SodaMachine {
    static void measureWeight(double weight, String unit, String flavor) {
        System.out.println("Measuring weight: " + weight + " " + unit + " for " + flavor + " soda...");
		if ( weight>5)
		{
		System.out.println(" weight is correct  ");
		return;
		}
		else
		{
			System.out.println("weight is not correct");	
		}
		
    }

    static void calculatePrice(String flavor, double weight, double pricePerUnit) {
        double totalPrice = weight * pricePerUnit;
        System.out.println("Calculating price for " + flavor + " soda with weight " + weight + " - Total Price: " + totalPrice);
		if ( flavor=="lemon")
		{
		System.out.println(" flavor is good  ");
		return;
		}
		else
		{
			System.out.println("flavor is not good ");	
		}
    }

    static void displayWeight(String flavor, double weight, String unit) {
        System.out.println("Displaying weight of " + flavor + " soda: " + weight + " " + unit);
		        System.out.println("Calculating price for " + flavor + " soda with weight " + weight + " - Total Price: " + totalPrice);
		if ( flavor=="orange")
		{
		System.out.println(" flavor is good  ");
		return;
		}
		else
		{
			System.out.println("flavor is not good ");	
		}
    }

    static void turnOff() {
        System.out.println("Turning off the soda machine...");
    }
}
