class Pocket {
    int money; // field declaration
    float count; // field declaration
    String brand; // field declaration
	int price;
	String color;

   public static void main(String args[]) {
        Pocket value1 = new Pocket();
        Pocket value2 = new Pocket();cls

        System.out.println("Default value of money is " + value1.money);
        System.out.println("Default value of count is " + value1.count);
        System.out.println("Default value of brand is " + value1.brand);
		System.out.println("Default value of brand is " + value1.price);
		System.out.println("Default value of brand is " + value1.color);
		System.out.println("\n");
		
		System.out.println("Default value of money is " + value2.money);
        System.out.println("Default value of count is " + value2.count);
        System.out.println("Default value of brand is " + value2.brand);
		System.out.println("Default value of brand is " + value2.price);
		System.out.println("Default value of brand is " + value2.color);
		System.out.println("\n");
		
	value1.money=2000;
	value1.count=5;
	value1.brand="puma";
	value1.price=1000;
	value1.color="red";
	
			
	value2.money=5000;
	value2.count=4;
	value2.brand="bata";
	value2.price=1500;
	value2.color="greey";
	
	
	System.out.println("after changed value of money is " + value1.money);
	System.out.println("after changed value of count is "+ value1.money);
	System.out.println("after changed value of count is "+ value1.brand);
	System.out.println("after changed value of price is " + value1.price);
	System.out.println("after changed value of color is " + value1.color);
	System.out.println("\n");
	
	System.out.println("after changed value of money is " + value2.money);
	System.out.println("after changed value of count is "+ value2.money);
	System.out.println("after changed value of count is "+ value2.brand);
	System.out.println("after changed value of price is " + value2.price);
	System.out.println("after changed value of color is " + value2.color);

	
    }
}
