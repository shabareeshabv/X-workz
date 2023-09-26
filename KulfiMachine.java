public class KulfiMachine {
    static void measureWeight(double weight, String unit, String flavor) {
        System.out.println("Measuring weight: " + weight + " " + unit + " for " + flavor + " kulfi...");
		if ( flavor =="chocolate")
		{
		System.out.println("kulfi flavor is chocolate");
		return;
		}
		else
		{
			System.out.println("kulfi is not chocolate");	
		}
    }

    static void calculatePrice(String flavor, double weight, double pricePerUnit) {
        double totalPrice = weight * pricePerUnit;
        System.out.println("Calculating price for " + flavor + " kulfi with weight " + weight + " - Total Price: " + totalPrice);
		if ( price>15.5)
		{
		System.out.println("kulfi  price is affodable");
		return;
		}
		else
		{
			System.out.println("kulfi  price is  not affodable");	
		}
    }

    static void displayWeight(String flavor, double weight, String unit) {
        System.out.println("Displaying weight of " + flavor + " kulfi: " + weight + " " + unit);
		if ( flavor =="chocolate")
		{
		System.out.println("kulfi flavor is chocolate");
		return;
		}
		else
		{
			System.out.println("kulfi is not chocolate");	
		}
    }

    static void turnOff() {
        System.out.println("Turning off the kulfi machine...");
    }
}
