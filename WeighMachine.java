public class WeighMachine {
    static void measureWeight(double weight, String unit, String item) {
        System.out.println("Measuring weight: " + weight + " " + unit + " for " + item + "...");
		if( weight>50)
		{
		System.out.println("  WeighMachine weight is correct");}
			else
			{
				System.out.println("  WeighMachine weight is  contains less weight");
			}
    }

    static void calculatePrice(String item, double weight, double pricePerUnit) {
        double totalPrice = weight * pricePerUnit;
        System.out.println("Calculating price for " + item + " with weight " + weight + " - Total Price: " + totalPrice);
		if( pricePerUnit>1)
		{
		System.out.println(" price value is corect");}
		
			else
			{
				System.out.println("  price value is not correct ");
			}
    }

    static void displayWeight(String item, double weight, String unit) {
        System.out.println("Displaying weight of " + item + ": " + weight + " " + unit);
		if( item=="value")
		{
		System.out.println("  value is corect");}
			else
			{
				System.out.println("  value is not correct ");
			}
		
    }

    static void turnOff() {
        System.out.println("Turning off the weigh machine...");
    }
}

