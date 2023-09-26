public class GoldsmithMachine {
    static void measureWeight(double weight, String unit, String material) {
        System.out.println("Measuring weight: " + weight + " " + unit + " for " + material + "...");
		if ( weight>1)
		{
		System.out.println(" gold is weight contain correct value ");
		return;
		}
		else
		{
			System.out.println("gold is weight contain  not correct value ");	
		}
		
    }

    static void calculatePrice(String material, double weight, double pricePerGram) {
        double totalPrice = weight * pricePerGram;
        System.out.println("Calculating price for " + material + " with weight " + weight + " - Total Price: " + totalPrice);
		if ( pricePerGram>3000)
		{
		System.out.println(" gold pricePerGram is costly ");
		return;
		}
		else
		{
			System.out.println("gold pricePerGram is less");	
		}
    }

    static void displayWeight(String material, double weight, String unit) {
        System.out.println("Displaying weight of " + material + ": " + weight + " " + unit);
		if ( weight>65)
		{
		System.out.println("weigh machine");
		return;
		}
		else
		{
			System.out.println("weigh_machine ");	
		}
    }

    static void turnOff() {
        System.out.println("Turning off the goldsmith machine...");
    }
}
